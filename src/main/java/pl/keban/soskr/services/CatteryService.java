package pl.keban.soskr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.keban.soskr.domain.Cattery;
import pl.keban.soskr.repository.CatteryRepository;

@Service
public class CatteryService{

	@Autowired
	CatteryRepository catteryRepository;

	@Transactional
	public void createCattery(String name) {
		Cattery cattery = new Cattery();
		cattery.setName(name);
		catteryRepository.save(cattery);
	}

	public List<Cattery> getList() {
		return catteryRepository.findAll();
	}

	public Cattery getCattery(long id) {
		return catteryRepository.findOne(id).get();
	}

	public long save(Cattery cattery) {
		return catteryRepository.save(cattery).getId();
	}

	public void delete(long id) {
		catteryRepository.delete(id);
	}

}
