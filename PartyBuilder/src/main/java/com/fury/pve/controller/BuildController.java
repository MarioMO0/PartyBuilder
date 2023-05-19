package com.fury.pve.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fury.pve.model.Build;
import com.fury.pve.service.BuildService;

@RestController
@RequestMapping("/builds")
public class BuildController {

	@Autowired
	private BuildService buildService;
	@GetMapping("/all")
	public List<Build> getAllBuilds(){
		return buildService.getAll();
	}
}
