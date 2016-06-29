package com.portal.parejas.modelo.negocio;

import com.portal.parejas.modelo.entidades.Persona;

public interface Reglas {

	boolean esIdeal(Persona candidato, Persona usuario);

	boolean esAfin(Persona candidato, Persona usuario);

}