package pl.keban.soskr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.keban.soskr.domain.Trait;
import pl.keban.soskr.repository.TraitRepository;

@Service
public class TraitService {

	private TraitRepository traitRepository;
	
	@Transactional
	public void createTrait(String group, String name, String code) {
		Trait trait = new Trait();
		trait.setName(name);
		traitRepository.save(trait);
	}

	public List<Trait> getList() {
		return traitRepository.findAll();
	}

	public Trait getTrait(Long id) {
		return traitRepository.findOne(id).get();
	}

	public Long save(Trait trait) {
		return traitRepository.save(trait).getId();
	}

	public void delete(Long id) {
		traitRepository.delete(id);
	}

	public List<Trait> getAllTraitForGroup(String group){
		return traitRepository.findByGroup(group);
	}
	
	public TraitRepository getTraitRepository() {
		return traitRepository;
	}

	@Autowired
	public void setTraitRepository(TraitRepository traitRepository) {
		this.traitRepository = traitRepository;
	}
}
