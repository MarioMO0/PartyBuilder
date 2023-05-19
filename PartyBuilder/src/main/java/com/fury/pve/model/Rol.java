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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "rol")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_rol")
	private int idRol;
	
	
	@Column(name = "nombre_rol")
	private String nombreRol;
	
	
	@Column(name = "desc_rol")
	private String descRol;
	
	/*@OneToOne
	@JoinColumn(name="id_build_fk")
	@Fetch(FetchMode.JOIN)
	private Build build;
	*/
	

	
//
//	@OneToMany(mappedBy = "rol")
//	private List<Participante> participante;
//	
	
}
