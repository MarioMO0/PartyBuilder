package com.fury.pve.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fury.pve.model.Rol;
import com.fury.pve.service.RolService;

@RestController
@RequestMapping("/roles")
public class RolController {

	@Autowired
	private RolService rolService;
	@GetMapping("/all")
	public List<Rol> getAllRoles(){
		return rolService.getAll();
	}
	
}
