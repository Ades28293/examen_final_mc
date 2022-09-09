package com.uce.edu.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vuel_id_seq")
	@SequenceGenerator(name = "vuel_id_seq", sequenceName = "vuel_id_seq", allocationSize = 1)
	@Column(name = "vuel_id")
	private Integer id;
	
	@Column(name = "vuel_numero_vuelo")
	private String numeroVuelo;
	
	@Column(name = "vuel_fecha_vuelo")
	private LocalDateTime fechaVuelo;
	
	@Column(name = "vuel_asientos_disponibles")
	private String asientosDisponibles;
	
	@Column(name = "vuel_valor_asiento_individual")
	private BigDecimal valorAsientoIndividual;
	
	@Column(name = "vuel_estado")
	private String estado;
	
	@Column(name = "vuel_origen")
	private String origen;
	
	@Column(name = "vuel_destino")
	private String destino;
	
	
	
	@ManyToOne
	@JoinColumn(name = "vuel_id_avi")
	private Avion avion;
	
	@OneToMany(mappedBy = "compra_pasaje")
	private List<CompraPasaje> comprasPasajes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public LocalDateTime getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDateTime fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public String getAsientosDisponibles() {
		return asientosDisponibles;
	}

	public void setAsientosDisponibles(String asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
	}

	public BigDecimal getValorAsientoIndividual() {
		return valorAsientoIndividual;
	}

	public void setValorAsientoIndividual(BigDecimal valorAsientoIndividual) {
		this.valorAsientoIndividual = valorAsientoIndividual;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public List<CompraPasaje> getComprasPasajes() {
		return comprasPasajes;
	}

	public void setComprasPasajes(List<CompraPasaje> comprasPasajes) {
		this.comprasPasajes = comprasPasajes;
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
	
	
	

}
