package com.fury.pve.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fury.pve.dao.ActividadDao;
import com.fury.pve.model.Actividad;

@Service
public class ActividadService {
	
	@Autowired
	private ActividadDao actividadRepository;
	
	public List<Actividad> getAll() {
		return (List<Actividad>) actividadRepository.findAll();
	}

	public Optional<Actividad> getActividad(int id) {
		return actividadRepository.findById(id);
	}

	public void save(Actividad rol) {
		actividadRepository.save(rol);
	}

	public void delete(int id) {
		if (getActividad(id).isPresent()) {
			actividadRepository.deleteById(id);
		}
	}
	
	public void update(Actividad actividad) {
		if(getActividad(actividad.getIdActividad()).isPresent()) {
			actividadRepository.save(actividad);
		}
	}
}
