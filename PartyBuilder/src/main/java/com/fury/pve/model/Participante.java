package com.fury.pve.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "participante")
public class Participante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_participante")
	private int idParticipante;
	
	
	@Column(name = "nombre_participante")
	private String nombreParticipante;
	
	@Column(name = "is_enlistado")
	private boolean enlistado;
	
	@Column(name="is_party")
	private boolean party;
	
	
	
	@OneToMany()
	@JoinColumn(name = "id_rol")
	@Fetch(FetchMode.JOIN)
	private List<Rol> rol;

}
