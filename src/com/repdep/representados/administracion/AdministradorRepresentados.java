package com.repdep.representados.administracion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.repdep.representados.entidades.Deportista;
import com.repdep.representados.entidades.Persona;
import com.repdep.representados.factory.deportistas.personaFactory;

public class AdministradorRepresentados {

	private static final int OPCION_SALIDA = 6;
	private static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
	
	public static void main(String[] args) throws Exception {
		int opcion =0;
		do {
			mostrarMenu();
			opcion = leerOpcion();
			ejecutarAccion(opcion);
		} while (opcion != OPCION_SALIDA);

	}

	private static void ejecutarAccion(int opcion) throws Exception { 
		
		
		if (esOpcionValida(opcion)){
			if(opcion == 5){
				imprimirRepresentados();
			}else {
				listaPersonas.add(crearPersona(Deportista.values()[opcion-1]));					
			}
		}
		
	}
	
	private static Persona crearPersona(Deportista opcion) throws Exception{

			return personaFactory.crearPersona(opcion);
	}

	private static void imprimirRepresentados() {
		for (Persona unaPersona: listaPersonas){
			System.out.println(unaPersona);
		}
	}

	private static int leerOpcion() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return Integer.parseInt(br.readLine());
	}
	
	private static boolean esOpcionValida(int opcion) {
		return opcion > 0 && opcion < 6;
	}

	private static void mostrarMenu() {
		System.out.println("Sistema de Administracion de Representados");
		System.out.println("1. Agregar futbolista");
		System.out.println("2. Agregar basketbolista");
		System.out.println("3. Agregar volleybolista");
		System.out.println("4. Agregar ajedrecista");
		System.out.println("5. Listar Representados");
		System.out.println("6. Salir");
	}

}
