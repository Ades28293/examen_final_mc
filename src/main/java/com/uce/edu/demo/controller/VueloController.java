package com.uce.edu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.demo.repository.modelo.Vuelo;
import com.uce.edu.demo.service.IVueloService;

@Controller
@RequestMapping(name = "/vuelo")
public class VueloController {

	@Autowired
	private IVueloService iVueloService;
	
	@GetMapping("/buscar")
	public String buscarVuelos(Model modelo) {
		
	List<Vuelo> lista=this.iVueloService.buscarTodos();
	modelo.addAttribute("vuelos", lista);
		
		return "vistaListaVuelos";
	}
	

	@GetMapping("/buscarUno/{idVuelo}")
	public String buscarVuelo(@PathVariable("idVuelo") Integer id, Model modelo) {
		System.out.println("El ID: " + id);
		Vuelo v = this.iVueloService.buscar(id);
		modelo.addAttribute("vuelos", v);
		return "vistaVuelo";
	}
	
	@GetMapping("/buscarUno/{idEstado}")
	public String buscarVuelo(@PathVariable("idEstado") String estado, Model modelo) {
		System.out.println("El ID: " + estado);
		Vuelo v = (Vuelo) this.iVueloService.buscarVuelosDisponibles(estado, estado, null, estado);
		modelo.addAttribute("vuelos", v);
		return "vistaVuelo";
	}
	
	

	@PutMapping("/actualizar/{idVuelo}")
	public String actualizarVuelo(@PathVariable("idVuelo") Integer id, Vuelo vuelo) {
		vuelo.setId(id);
		this.iVueloService.actualizar(vuelo);
		return "redirect:/vuelos/buscar";
	}

	@PostMapping("/insertar")
	public String insertarVuelo(Vuelo vuelo) {
		this.iVueloService.insertar(vuelo);
		return "redirect:/vuelos/buscar";
	}

	// Metodos de redireccionamiento a paginas
	@GetMapping("/nuevaVuelo")
	public String paginaNuevaVuelo(Vuelo vuelo) {
		return "vistaNuevoVuelo";
	}
	
	

}
