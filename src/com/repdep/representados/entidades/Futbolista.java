package com.repdep.representados.entidades;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Futbolista extends Persona{
	private ArrayList<String> equipos;
	private String posicion;
	private BigDecimal ficha;
	
	
	public ArrayList<String> getEquipos() {
		return equipos;
	}
	public void setEquipos(ArrayList<String> equipos) {
		this.equipos = equipos;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public BigDecimal getFicha() {
		return ficha;
	}
	public void setFicha(BigDecimal ficha) {
		this.ficha = ficha;
	}
	
	
}
