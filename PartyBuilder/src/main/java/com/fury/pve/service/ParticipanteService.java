package com.fury.pve.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fury.pve.dao.ParticipanteDao;
import com.fury.pve.model.Participante;
@Service
public class ParticipanteService {

	@Autowired
	private ParticipanteDao participanteRepository;
	

	public List<Participante> getAll() {
		return (List<Participante>) participanteRepository.findAll();
	}

	public Optional<Participante> getParticipante(int id) {
		return participanteRepository.findById(id);
	}

	public void save(Participante participante) {
		participanteRepository.save(participante);
	}

	public void delete(int id) {
		if (getParticipante(id).isPresent()) {
			participanteRepository.deleteById(id);
		}
	}
	
	public void update(Participante participante) {
		if(getParticipante(participante.getIdParticipante()).isPresent()) {
			participanteRepository.save(participante);
		}
	}
}
