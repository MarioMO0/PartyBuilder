package com.fury.pve.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fury.pve.dao.ItemDao;
import com.fury.pve.model.Item;
@Service
public class ItemService {
	@Autowired
	private ItemDao itemReposirory;

	public List<Item> getAll() {
		return  (List<Item>) itemReposirory.findAll();
	}

	public Optional<Item> getItem(int id) {
		return itemReposirory.findById(id);
	}

	public void save(Item item) {
		itemReposirory.save(item);
	}

	public void delete(int id) {
		if (getItem(id).isPresent()) {
			itemReposirory.deleteById(id);
		}
	}
	
	public void update(Item item) {
		if(getItem(item.getIdItem()).isPresent()) {
			itemReposirory.save(item);
		}
	}

}
