package com.fury.pve.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fury.pve.dao.RolDao;
import com.fury.pve.model.Rol;
@Service
public class RolService {
	@Autowired
	private RolDao rolRepository;
	
	public List<Rol> getAll() {
		return (List<Rol>) rolRepository.findAll();
	}

	public Optional<Rol> getRol(int id) {
		return rolRepository.findById(id);
	}

	public void save(Rol rol) {
		rolRepository.save(rol);
	}

	public void delete(int id) {
		if (getRol(id).isPresent()) {
			rolRepository.deleteById(id);
		}
	}
	
	public void update(Rol rol) {
		if(getRol(rol.getIdRol()).isPresent()) {
			rolRepository.save(rol);
		}
	}
}
