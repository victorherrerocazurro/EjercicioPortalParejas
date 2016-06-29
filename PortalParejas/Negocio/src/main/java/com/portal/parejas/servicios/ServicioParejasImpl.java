package com.portal.parejas.servicios;

import java.util.ArrayList;
import java.util.Collection;

import com.portal.parejas.modelo.entidades.Persona;
import com.portal.parejas.modelo.negocio.Reglas;
import com.portal.parejas.modelo.servicios.ServicioParejas;
import com.portal.parejas.persistencia.dao.PersonaDao;

public class ServicioParejasImpl implements ServicioParejas {

	private PersonaDao dao;

	private Reglas reglas;
	
	public ServicioParejasImpl() {
	}
	
	public ServicioParejasImpl(PersonaDao dao, Reglas reglas) {
		this.dao = dao;
		this.reglas = reglas;
	}

	public void setDao(PersonaDao dao) {
		this.dao = dao;
	}

	public void setReglas(Reglas reglas) {
		this.reglas = reglas;
	}

	@Override
	public Persona getIdeal(Persona persona) {
		Persona ideal = null;
		Collection<Persona> todas = dao.getAll();
		for (Persona candidato : todas) {
			if (!candidato.equals(persona) && reglas.esIdeal(candidato, persona)) {
				ideal = candidato;
				break;
			}
		}

		return ideal;

	}

	@Override
	public Collection<Persona> getAfines(Persona persona) {
		Collection<Persona> afines = new ArrayList<Persona>();

		Collection<Persona> candidatos = dao.getAll();;

		for (Persona candidato : candidatos) {
			if (!candidato.equals(persona) && reglas.esAfin(candidato, persona)) {
				afines.add(candidato);
			}
		}

		return afines;
	}

	@Override
	public long alta(Persona persona) {
		return dao.insertar(persona);
	}

	@Override
	public void baja(Persona persona) {
		dao.borrar(persona);
	}

	@Override
	public Persona login(long id) {
		return dao.getById(id);
	}

}
