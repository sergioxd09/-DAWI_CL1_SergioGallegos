package com.example.demo.DAW1CL1SergioGallegos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.DAW1CL1SergioGallegos.model.bd.Especialidad;
import com.example.demo.DAW1CL1SergioGallegos.service.EspecialidadService;

@Controller
@RequestMapping("/Especialidad")
public class EspecialidadController {
	@Autowired
	private EspecialidadService estadoService;

	
	@GetMapping("/frmListEspe")
	public String frmListaEspecialidad(Model model) {
		model.addAttribute("listaEspecialidad",
				estadoService.listarEspecialidad());
		return "Especialidad/frmListEspe";
	}
	@GetMapping("/frmRegistraEspecialidad")
	public String frmRegEstado(Model model) {
		model.addAttribute("especialidadForm", new Especialidad());
		model.addAttribute("visualizar",false);
		return "Especialidad/frmRegistrarEspecialidad";
	}
	@PostMapping("frmRegistraEspecialidad")
		public String registrarEstado(@ModelAttribute("especialidadForm")Especialidad especialidad,Model model) {
		String mensaje = "especialidad registrado correctamente";
		try {
			estadoService.registrarEspecialidad(especialidad);
		}catch(Exception e) {
			mensaje="especialidad no registrado";
		}
		model.addAttribute("especialidadForm",new Especialidad());
		model.addAttribute("visualizar",true);
		model.addAttribute("respuesta",mensaje);
		estadoService.registrarEspecialidad(especialidad);
		return "Especialidad/frmRegistraEspecialidad";
	}
}
