package org.cibertec.edu.pe.interfaces;

import org.cibertec.edu.pe.modelo.empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IEmpleados extends JpaRepository<empleados, Integer>{
	
}
