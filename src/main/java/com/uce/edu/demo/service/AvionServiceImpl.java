package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IAvionRepository;
import com.uce.edu.demo.repository.modelo.Avion;

@Service
public class AvionServiceImpl implements IAvionService{
	@Autowired
	private IAvionRepository avionRepository;
	
	@Override
	public void insertar(Avion avion) {
		// TODO Auto-generated method stub
		this.avionRepository.insertar(avion);
	}

	@Override
	public void actualizar(Avion avion) {
		// TODO Auto-generated method stub
		this.avionRepository.actualizar(avion);
	}

	@Override
	public Avion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.avionRepository.buscar(id);
	}

}
