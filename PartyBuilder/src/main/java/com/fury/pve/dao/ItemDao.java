package com.fury.pve.dao;

import org.springframework.data.repository.CrudRepository;

import com.fury.pve.model.Actividad;
import com.fury.pve.model.Item;

public interface ItemDao extends CrudRepository<Item, Integer>{

}
