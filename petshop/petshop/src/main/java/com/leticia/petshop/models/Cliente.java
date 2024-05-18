package com.leticia.petshop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id_Cliente; 
	private String nome; 
	private String especie; 
	private String raca; 
	private Double peso;
	public Long getIdCliente() {
		return id_Cliente;
	}
	public void setIdCliente(Long id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	} 
	
	
	
	
}
