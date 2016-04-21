package pl.keban.soskr.repository;

import java.util.List;

import pl.keban.soskr.domain.Trait;

public interface TraitRepository extends BaseRepository<Trait, Long> {
    
    List<Trait> findByGroup(String group);
}
