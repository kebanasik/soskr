package pl.keban.soskr.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import pl.keban.soskr.domain.Cattery;


public interface CatteryRepository extends Repository<Cattery, Long>{

	void delete(Long id);
	 
    List<Cattery> findAll();
 
    Optional<Cattery> findOne(Long id);
 
    Cattery save(Cattery persisted);
}
