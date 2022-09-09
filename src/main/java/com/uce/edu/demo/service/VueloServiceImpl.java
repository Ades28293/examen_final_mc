package com.uce.edu.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IVueloRepository;
import com.uce.edu.demo.repository.modelo.Vuelo;

@Service
public class VueloServiceImpl implements IVueloService{
	@Autowired
	private IVueloRepository iVueloRepository;

	@Override
	public void insertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.iVueloRepository.insertar(vuelo);
	}

	@Override
	public void actualizar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.iVueloRepository.actualizar(vuelo);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public Vuelo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iVueloRepository.buscar(id);
	}

	@Override
	public List<Vuelo> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iVueloRepository.buscarTodos();
	}

	@Override
	public List<Vuelo> buscarVuelosDisponibles(String origen, String destino, LocalDateTime fechaVuelo, String estado) {
		// TODO Auto-generated method stub
		return this.buscarVuelosDisponibles(origen, destino, fechaVuelo, estado);
	}

}
