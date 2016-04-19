package pl.keban.soskr.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cat {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Date dateOfBirth;
	private Breed breed;
	private Boolean neutered;
	
}
