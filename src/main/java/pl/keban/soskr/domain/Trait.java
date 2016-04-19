package pl.keban.soskr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Trait {
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable=false)
	private String group;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String code;

}
