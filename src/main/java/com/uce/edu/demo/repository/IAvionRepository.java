package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Avion;

public interface IAvionRepository {
	public void insertar(Avion avion);

	public void actualizar(Avion avion);

	public Avion buscar(Integer id);
}
