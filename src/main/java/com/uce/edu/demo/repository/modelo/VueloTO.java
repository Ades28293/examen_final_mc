package com.uce.edu.demo.repository.modelo;

import java.time.LocalDateTime;

public class VueloTO {
	private String origen; 
	private String destino; 
	private LocalDateTime fechaVuelo;
	private String estado;
	
	public VueloTO() {
		
	}
	
	public VueloTO(String origen, String destino, LocalDateTime fechaVuelo, String estado) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.fechaVuelo = fechaVuelo;
		this.estado = estado;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDateTime getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDateTime fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
