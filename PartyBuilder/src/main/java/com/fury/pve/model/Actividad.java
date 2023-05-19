package com.fury.pve.model;

import java.time.LocalDate;
import java.util.Date;
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
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="actividad")
@Getter
@Setter
public class Actividad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_actividad")
	private int idActividad;
	
	@Column(name = "desc_act")
	private String descActividad;
	
	@Column(name = "fecha")
	private Date fyhActividad;
	
	@Column(name = "is_terminada")
	private boolean terminada;
	
	@Column(name = "tipo_actividad")
	private String tipoActividad;
		
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
			name = "participante_actividad",
			joinColumns = {@JoinColumn(name="_id_actividad",referencedColumnName = "id_actividad")},
			inverseJoinColumns = {@JoinColumn(name="_id_participante" , referencedColumnName = "id_participante")}
			)
	private List<Participante> participantes;
}
