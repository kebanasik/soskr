package pl.keban.soskr.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Person {
	
	@Id
    @GeneratedValue
    private Long id;
	private String firstName;
	private String lastName;
}
