package com.example.demo.DAW1CL1SergioGallegos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAW1CL1SergioGallegos.model.bd.Especialidad;
import com.example.demo.DAW1CL1SergioGallegos.repository.EspecialidadRepository;

@Service
public class EspecialidadService {
	
@Autowired
private EspecialidadRepository especialidadRepository;

	public List<Especialidad> listarEspecialidad(){
		return especialidadRepository.findAll();
	}
	
	public void registrarEspecialidad(Especialidad especialidad) {
		especialidadRepository.save(especialidad);
	}
	
}
