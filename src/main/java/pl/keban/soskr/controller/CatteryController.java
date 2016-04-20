package pl.keban.soskr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pl.keban.soskr.domain.Cattery;
import pl.keban.soskr.services.CatteryService;

@RestController
@RequestMapping("/cattery")
public class CatteryController {

	@Autowired
	CatteryService catteryService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.POST)
	public void createCattery(@RequestBody String name) {
		catteryService.createCattery(name);
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Cattery getCattery(@PathVariable  Long id) {
		return catteryService.getCattery(id);
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Cattery> list() {
		return catteryService.getList();
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> errorHandler(Exception exc) {
		exc.printStackTrace();
		return new ResponseEntity<>(exc.getMessage(), HttpStatus.BAD_REQUEST);
	}

}
