package com.example.demo.DAW1CL1SergioGallegos.model.bd;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "especialidad")
public class Especialidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdEsp;
	@Column(name = "NomEsp")
	private String NomEsp;
	@Column(name = "Costo")
	private double Costo;
}
