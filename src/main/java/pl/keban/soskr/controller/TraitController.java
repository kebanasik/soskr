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
import pl.keban.soskr.domain.Trait;
import pl.keban.soskr.services.CatteryService;
import pl.keban.soskr.services.TraitService;

@RestController
@RequestMapping("/trait")
public class TraitController {

	@Autowired
	TraitService traitService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.POST)
	public void createTrait(@RequestBody String group, @RequestBody String name, @RequestBody String code) {
		traitService.createTrait(group, name, code);
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Trait getCattery(@PathVariable  Long id) {
		return traitService.getTrait(id);
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Trait> getAll() {
		return traitService.getList();
	}
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{group}", method = RequestMethod.GET)
	public List<Trait> getAllForGroup(@PathVariable String group) {
		return traitService.getAllTraitForGroup(group);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> errorHandler(Exception exc) {
		exc.printStackTrace();
		return new ResponseEntity<>(exc.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
