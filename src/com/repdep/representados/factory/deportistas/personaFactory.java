package com.repdep.representados.factory.deportistas;

import com.repdep.representados.entidades.Ajedrecista;
import com.repdep.representados.entidades.Basketbolista;
import com.repdep.representados.entidades.Deportista;
import com.repdep.representados.entidades.Futbolista;
import com.repdep.representados.entidades.Persona;
import com.repdep.representados.entidades.Volleybolista;

public class personaFactory {

	public static Persona crearPersona(Deportista ptipo) throws Exception {

			switch(ptipo){
			
			case Basketbolista:
				return new Basketbolista();
			case Futbolista:
				return new Futbolista();
			case Volleybolista:
				return new Volleybolista();
			case Ajedrecista:
				return new Ajedrecista();
			default:
				throw new Exception ("Error creando tipo de deportista");
			}
			
	}
	
}
