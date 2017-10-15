package br.com.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String nome;
	@Column
	private String pessoacol;
	
		
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the pessoacol
	 */
	public String getPessoacol() {
		return pessoacol;
	}
	/**
	 * @param pessoacol the pessoacol to set
	 */
	public void setPessoacol(String pessoacol) {
		this.pessoacol = pessoacol;
	}
	
	

}
