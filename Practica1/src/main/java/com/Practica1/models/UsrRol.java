package com.Practica1.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usr_rol")
public class UsrRol {
	@Id
	@Column(name = "id_rol")
	private Long idRol;
	
	@OneToMany(mappedBy = "usrRol")
	private List<UsrUsuario> usrUsuarios;
	
	public UsrRol() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}
	
	
	
}

