package com.fury.pve.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="build")
public class Build {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_build")
	private int idBuild;
	
	@Column(name="nombre_build")
	private String nombreBuild;
	
@ManyToMany
@JoinTable(name = "item_build",
joinColumns = @JoinColumn(name ="_id_build",referencedColumnName = "id_build"), 
inverseJoinColumns = @JoinColumn(name="_id_item",referencedColumnName = "id_item"))
	private List<Item> items;
	




}
