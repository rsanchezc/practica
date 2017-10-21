package com.repdep.representados.entidades;

import java.math.BigDecimal;

public class Persona {
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected BigDecimal estatura;
	protected BigDecimal peso;
	
	
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public BigDecimal getEstatura() {
		return estatura;
	}
	public void setEstatura(BigDecimal estatura) {
		this.estatura = estatura;
	}
	public BigDecimal getPeso() {
		return peso;
	}
	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Esta es una persona " + this.getClass().getSimpleName();
	}
	
	
}
