package com.cibertec.prjdemo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Entity
@Table(name="domicilio")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DomicilioEntity extends BaseEntity {
	

	private String street;
	private int number;
	
 
    @ManyToOne
    @JoinColumn(name = "fk_localidad", nullable= false)
	private LocalidadEntity localidad;
	


}
