package com.portal.parejas.modelo.servicios;

import java.util.Collection;

import com.portal.parejas.modelo.entidades.Persona;
import com.portal.parejas.modelo.negocio.Reglas;
import com.portal.parejas.persistencia.dao.PersonaDao;

public interface ServicioParejas {

	public void setDao(PersonaDao dao);
	
	public void setReglas(Reglas reglas);
	
	public long alta(Persona persona);
	
	public void baja(Persona persona);
	
	public Persona login(long id);
	
	public Persona getIdeal(Persona persona);

	public Collection<Persona> getAfines(Persona persona);
}