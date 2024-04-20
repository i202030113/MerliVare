package com.cibertec.prjdemo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="autor")

public class AutorEntity extends BaseEntity {

	@Column(columnDefinition = "CHAR(20)")
	private String name;
	
	@Column(name="lastname", length =50)
	private String lastName;
}
