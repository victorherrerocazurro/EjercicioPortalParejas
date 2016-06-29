package com.portal.parejas.negocio;

import static java.lang.Math.abs;

import com.portal.parejas.modelo.entidades.Persona;
import com.portal.parejas.modelo.negocio.Reglas;

public class ReglasJavaImpl implements Reglas {

	/**
	 * Para ser Ideales,
	 * 	-Han de tener distinto genero
	 * 	-Tener como mucho 3 años de diferencia
	 * 	-Tener menos de 10 cm de diferencia en la altura
	 */
	
	public boolean esIdeal(Persona candidato, Persona usuario) {
		return candidato.getGenero() != usuario.getGenero() 
				&& abs(candidato.getEdad()-usuario.getEdad())<=3
				&& abs(candidato.getAltura()-usuario.getAltura())<.10f;
	}
	
	/**
	 * Para ser Afines,
	 * 	-El genero es indistinto
	 * 	-Tener menos de 10 años de diferencia
	 * 	-Tener menos de 50 cm de diferencia en la altura
	 */
	
	public boolean esAfin(Persona candidato, Persona usuario) {
		return abs(candidato.getEdad()-usuario.getEdad())<10
				&& abs(candidato.getAltura()-usuario.getAltura())<.50f;
	}

}
