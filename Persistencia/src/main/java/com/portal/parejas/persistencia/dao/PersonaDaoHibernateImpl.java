package com.portal.parejas.persistencia.dao;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.portal.parejas.modelo.entidades.Persona;
import com.portal.parejas.persistencia.dao.PersonaDao;

public class PersonaDaoHibernateImpl implements PersonaDao {

	private SessionFactory sessionFactory;
	
	@Override
	public long insertar(Persona persona) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.beginTransaction();
		Long id = (Long) sesion.save(persona);
		sesion.getTransaction().commit();
		return id;
	}

	@Override
	public void borrar(Persona persona) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.getTransaction().begin();
		sesion.delete(persona);
		sesion.getTransaction().commit();
	}

	@Override
	public Collection<Persona> getAll() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<Persona> facturas=session.createQuery("from Persona").list();
		session.getTransaction().commit();
		return facturas;
	}

	@Override
	public Persona getById(long id) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Persona persona = (Persona) session.get(Persona.class, id);
		session.getTransaction().commit();
		return persona;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
