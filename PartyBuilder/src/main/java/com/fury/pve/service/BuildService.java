package com.fury.pve.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fury.pve.dao.BuildDao;
import com.fury.pve.model.Actividad;
import com.fury.pve.model.Build;

@Service
public class BuildService {
	@Autowired
	private BuildDao buildRepository;
	public List<Build> getAll() {
		return (List<Build>) buildRepository.findAll();
	}

	public Optional<Build> getBuild(int id) {
		return buildRepository.findById(id);
	}

	public void save(Build build) {
		buildRepository.save(build);
	}

	public void delete(int id) {
		if (getBuild(id).isPresent()) {
			buildRepository.deleteById(id);
		}
	}
	
	public void update(Build build) {
		if(getBuild(build.getIdBuild()).isPresent()) {
			buildRepository.save(build);
		}
	}
}
