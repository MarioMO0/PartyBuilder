package com.fury.pve.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fury.pve.model.Actividad;
import com.fury.pve.service.ActividadService;

@RestController
@RequestMapping("/actividades")
public class ActividadController {
	
@Autowired
private ActividadService actividadService;


@GetMapping("/all")
public List<Actividad> getAllActividades(){
	return actividadService.getAll();
}
@GetMapping("/act/{id}")
public Optional<Actividad> getActividad(@PathVariable(name = "id") int id) {
	return actividadService.getActividad(id);
}

@PostMapping("/save")
public String saveActividad(@RequestBody Actividad act) {
	String mensaje ="";
	
	if(getActividad(act.getIdActividad()).isPresent())
	{
		mensaje="por favor modifica la actividad ya creada antes en vez de crear una nueva";
		return mensaje;
	}
	actividadService.save(act);
	mensaje="Actividad creada correctamente";
	return mensaje;
}


}
