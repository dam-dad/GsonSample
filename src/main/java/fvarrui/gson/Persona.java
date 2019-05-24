package fvarrui.gson;

import java.time.Instant;

public class Persona {
	private String nombre;
	private String apellidos;
	private Instant fechaNacimiento;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Instant getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Instant fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
