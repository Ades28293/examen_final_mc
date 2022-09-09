package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Avion;

public interface IAvionService {
	public void insertar(Avion avion);

	public void actualizar(Avion avion);

	public Avion buscar(Integer id);
}
