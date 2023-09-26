package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IEmpleadosService;
import org.cibertec.edu.pe.modelo.empleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class EmpleadoController {
	@Autowired
	private IEmpleadosService servicio;
	@GetMapping
	public String Listar(Model e) {
		List<empleados> LEmpleados = servicio.Listado();
		e.addAttribute("listEmp",LEmpleados);
		return "empleado";
	}

}
