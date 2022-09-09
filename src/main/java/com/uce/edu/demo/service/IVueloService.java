package com.uce.edu.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.modelo.Vuelo;

public interface IVueloService {
	public void insertar(Vuelo vuelo);
	
	public void actualizar(Vuelo vuelo);
	
	public Vuelo buscar(Integer id);
	
	public List<Vuelo> buscarTodos();
	
	public List<Vuelo> buscarVuelosDisponibles(String origen ,String destino,LocalDateTime fechaVuelo,String estado);
}
