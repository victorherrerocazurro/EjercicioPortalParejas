package com.portal.parejas.negocio;

import org.junit.Assert;
import org.junit.Test;

import com.portal.parejas.modelo.entidades.Persona;

public class TestReglas {

	@Test
	public void testEsIdeal() {
		
		ReglasJavaImpl sut = new ReglasJavaImpl();
		//Datos de prueba de entrada
		Persona usuario = new Persona("Juan", 32, 1.80f, 'M');
		Persona candidato = new Persona("Maria", 29, 1.75f, 'F');
		
		//Ejecucion de la prueba
		boolean resultadoObtenido = sut.esIdeal(candidato, usuario);
		
		Assert.assertTrue(resultadoObtenido);
	}
	
	@Test
	public void testEsAfin() {
		ReglasJavaImpl sut = new ReglasJavaImpl();
		//Datos de prueba de entrada
		Persona usuario = new Persona("Juan", 32, 1.80f, 'M');
		Persona candidato = new Persona("Maria", 29, 1.75f, 'F');
		
		//Ejecucion de la prueba
		boolean resultadoObtenido = sut.esAfin(candidato, usuario);
		
		Assert.assertTrue(resultadoObtenido);

	}
	
	@Test
	public void testNoEsIdeal() {
		
		ReglasJavaImpl sut = new ReglasJavaImpl();
		//Datos de prueba de entrada
		Persona usuario = new Persona("Juan", 33, 1.80f, 'M');
		Persona candidato = new Persona("Maria", 29, 1.75f, 'F');
		
		//Ejecucion de la prueba
		boolean resultadoObtenido = sut.esIdeal(candidato, usuario);
		
		Assert.assertFalse(resultadoObtenido);
	}
	
	@Test
	public void testNoEsAfin() {
		ReglasJavaImpl sut = new ReglasJavaImpl();
		//Datos de prueba de entrada
		Persona usuario = new Persona("Juan", 32, 1.80f, 'M');
		Persona candidato = new Persona("Maria", 21, 1.75f, 'F');
		
		//Ejecucion de la prueba
		boolean resultadoObtenido = sut.esAfin(candidato, usuario);
		
		Assert.assertFalse(resultadoObtenido);

	}

}
