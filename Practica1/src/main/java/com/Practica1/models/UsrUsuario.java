package com.Practica1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usr_usuarios")
public class UsrUsuario {
	@Id
	@Column(name = "id_usuario")
	private String idUsuario;
	
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "id_rol")
	private UsrRol usrRol;
	
	public UsrUsuario() {
	}

	

	public UsrUsuario(String idUsuario, String nombre) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
	}



	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public UsrRol getUsrRol() {
		return usrRol;
	}



	public void setUsrRol(UsrRol usrRol) {
		this.usrRol = usrRol;
	}
	
}

