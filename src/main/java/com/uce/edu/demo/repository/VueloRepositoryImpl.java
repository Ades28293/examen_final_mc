package com.uce.edu.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Vuelo;

@Repository
@Transactional
public class VueloRepositoryImpl implements IVueloRepository{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vuelo);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void actualizar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vuelo);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Vuelo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vuelo.class, id);
	}

	@Override
	public List<Vuelo> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> myQuery=this.entityManager.createQuery("SELECT v FROM Vuelo V ", Vuelo.class);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Vuelo> buscarVuelosDisponibles(String origen, String destino, LocalDateTime fechaVuelo,String estado) {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> myQuery=this.entityManager.createQuery("SELECT v FROM Vuelo v WHERE v.estado=:datoEstado", Vuelo.class);
		myQuery.setParameter("datoEstado", estado);
		
		return myQuery.getResultList();
	}

}
