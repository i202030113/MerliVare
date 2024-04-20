package com.cibertec.prjdemo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="persona")

public class PersonaEntity extends BaseEntity {


	private String name;
	@Column(name="lastname", length =50)
	private String lastName;
	private String dni;
	
	 @OneToOne(cascade = CascadeType.ALL)
	 private DomicilioEntity domicilio;
	 
	 
	 @OneToMany(cascade =CascadeType.ALL, orphanRemoval = true)
	 @JoinTable(name ="persona_libro",
	 joinColumns = @JoinColumn(name = "persona_id"),
	 inverseJoinColumns = @JoinColumn(name = "libro_id")
	 )
	 
	 private List<LibroEntity> libro = new ArrayList<LibroEntity>();
}
