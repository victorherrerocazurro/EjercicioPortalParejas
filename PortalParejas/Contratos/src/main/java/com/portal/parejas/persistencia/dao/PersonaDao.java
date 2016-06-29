package com.portal.parejas.persistencia.dao;

import java.util.Collection;

import com.portal.parejas.modelo.entidades.Persona;

public interface PersonaDao {

	public long insertar(Persona persona);

	public void borrar(Persona persona);

	public Collection<Persona> getAll();

	public Persona getById(long id);

}