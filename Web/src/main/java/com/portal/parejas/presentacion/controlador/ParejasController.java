package com.portal.parejas.presentacion.controlador;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portal.parejas.modelo.entidades.Persona;
import com.portal.parejas.modelo.servicios.ServicioParejas;

@Controller
@RequestMapping("/Parejas/")
public class ParejasController {
	@Autowired
	private ServicioParejas servicio;
	
	@RequestMapping("afines.html")
	//http://localhost:8080/PortalDeParejas/Parejas/afines.html?id=1
	public String busquedaDeAfines(Integer id, Model model){
		Persona persona = servicio.login(id);
		Collection<Persona> afines = servicio.getAfines(persona);
		
		model.addAttribute("afines", afines);
		
		return "listadoAfines";
	}
	
	@RequestMapping("ideal.html")
	public String busquedaIdeales(Integer id, Model model) {
		Persona persona = servicio.login(id);
		Persona ideal = servicio.getIdeal(persona);
		
		model.addAttribute("ideal", ideal);
		
		return "ideal";
	}
	
}
