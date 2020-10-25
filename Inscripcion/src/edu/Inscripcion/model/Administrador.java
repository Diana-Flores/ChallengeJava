package edu.Inscripcion.model;

public class Administrador {
	
	String nombre;
	String apellido;
	
	String cuposDisponibles[];
	String cuposNoDisponibles[];
	String profesores[];
	String materias[];
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String[] getCuposDisponibles() {
		return cuposDisponibles;
	}
	public void setCuposDisponibles(String[] cuposDisponibles) {
		this.cuposDisponibles = cuposDisponibles;
	}
	public String[] getCuposNoDisponibles() {
		return cuposNoDisponibles;
	}
	public void setCuposNoDisponibles(String[] cuposNoDisponibles) {
		this.cuposNoDisponibles = cuposNoDisponibles;
	}
	public String[] getProfesores() {
		return profesores;
	}
	public void setProfesores(String[] profesores) {
		this.profesores = profesores;
	}
	public String[] getMaterias() {
		return materias;
	}
	public void setMaterias(String[] materias) {
		this.materias = materias;
	}
	
	

}
