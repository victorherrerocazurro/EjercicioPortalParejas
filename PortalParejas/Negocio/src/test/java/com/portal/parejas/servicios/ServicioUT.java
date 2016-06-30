package com.portal.parejas.servicios;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import com.portal.parejas.modelo.entidades.Persona;
import com.portal.parejas.modelo.negocio.Reglas;
import com.portal.parejas.persistencia.dao.PersonaDao;

public class ServicioUT {

	private ServicioParejasImpl sut ;
	private Persona juan = new Persona(1, "Juan", 32, 1.80f, 'M');
	private Persona maria = new Persona(2, "Maria", 29, 1.75f, 'F');
	
	
	public ServicioUT() {
		sut = new ServicioParejasImpl(new PersonaDao() {
			
			@Override
			public long insertar(Persona persona) {
				return 1;
			}
			
			@Override
			public Persona getById(long id) {
				return juan;
			}
			
			@Override
			public Collection<Persona> getAll() {
				return Arrays.asList(new Persona[]{
						juan, 
						maria});
			}
			
			@Override
			public void borrar(Persona persona) {
				// TODO Auto-generated method stub
				
			}
		}, new Reglas() {
			
			@Override
			public boolean esIdeal(Persona candidato, Persona usuario) {
				return true;
			}
			
			@Override
			public boolean esAfin(Persona candidato, Persona usuario) {
				return true;
			}
		});
	}
	
	
	@Test
	public void testAlta() {
		
		//Datos de prueba
		Persona persona = juan;
		long resultadoEsperado = 1;
		
		//Ejecucion
		long resultadoObtenido = sut.alta(persona);
		
		//Validacion
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void testBaja() {
		
		//Datos de prueba
		Persona persona = juan;
		
		try {
			//Ejecucion
			sut.baja(persona);
		} catch(Exception ex){
			//Validacion
			Assert.fail("Se ha producido una escepcion");
		}
	}
	
	@Test
	public void testlogin() {
		
		//Datos de prueba
		long id = 1;
		Persona resultadoEsperado = juan;
		
		//Ejecucion
		Persona resultadoObtenido = sut.login(id);
		
		//Validacion
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void testAfines() {
		
		//Datos de prueba
		Persona persona = juan;
		
		Collection<Persona> resultadoEsperado = Arrays.asList(new Persona[]{maria});
		
		//Ejecucion
		Collection<Persona> resultadoObtenido = sut.getAfines(persona);
		
		//Validacion
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void testIdeal() {
		
		//Datos de prueba
		Persona persona = juan;
		
		Persona resultadoEsperado = maria;
		
		//Ejecucion
		Persona resultadoObtenido = sut.getIdeal(persona);
		
		//Validacion
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

}
