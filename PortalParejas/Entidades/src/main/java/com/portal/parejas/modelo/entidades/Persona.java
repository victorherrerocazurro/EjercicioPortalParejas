package com.portal.parejas.modelo.entidades;

import java.io.Serializable;

public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String nombre;
	private int edad;
	private double altura;
	private char genero;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(long id, String nombre, int edad, float altura, char genero) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.genero = genero;
	}
	public Persona(String nombre, int edad, float altura, char genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad
				+ ", altura=" + altura + ", genero=" + genero + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
