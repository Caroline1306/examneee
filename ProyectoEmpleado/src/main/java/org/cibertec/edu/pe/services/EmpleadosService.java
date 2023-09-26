package org.cibertec.edu.pe.services;


import java.util.List;

import org.cibertec.edu.pe.interfaceService.IEmpleadosService;
import org.cibertec.edu.pe.interfaces.IEmpleados;
import org.cibertec.edu.pe.modelo.empleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadosService implements IEmpleadosService{
	@Autowired
	private IEmpleados data;

	@Override
	public List<empleados> Listado() {
		// TODO Auto-generated method stub
		return (List<empleados>)data.findAll();
			}
	
}
