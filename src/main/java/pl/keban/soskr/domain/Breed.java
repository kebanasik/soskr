package pl.keban.soskr.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Breed {

	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String code;
	
	@ManyToMany
	private List<Trait> avaiableTraits;
}
