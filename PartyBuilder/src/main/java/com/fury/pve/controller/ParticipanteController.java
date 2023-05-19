package com.fury.pve.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fury.pve.model.Participante;
import com.fury.pve.service.ParticipanteService;

@RestController
@RequestMapping("/participantes")
public class ParticipanteController {
@Autowired
ParticipanteService participanteService;
@GetMapping("/all")
public List<Participante> getAllParticipante(){
	return participanteService.getAll();
}
}

