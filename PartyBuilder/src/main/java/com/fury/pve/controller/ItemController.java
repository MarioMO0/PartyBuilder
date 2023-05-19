package com.fury.pve.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fury.pve.model.Item;
import com.fury.pve.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {
	@Autowired
	private ItemService itemService;
@GetMapping("/all")
	public List<Item> getAllItems() {
		return itemService.getAll();
	}
}
