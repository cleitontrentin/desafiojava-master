package br.com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Projetos {
	
	@Id
	@GeneratedValue
	private long idProjetos;
	@Column
	private String nome;
	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	private Date dataInicio;
	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	private Date dataPrivsao;
	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	private Date dataFim;
	@Column
	private String descricao;
	@Column
	private Float orcamento;
	@Column
	private String risco;
    /**
	 * @return the pessoa
	 */
	public Pessoa getPessoa() {
		return Pessoa;
	}
	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(Pessoa pessoa) {
		Pessoa = pessoa;
	}
	@ManyToOne
    @JoinColumn(name = "idPessoa")
    private Pessoa	Pessoa;
	/**
	 * @return the idProjetos
	 */
	public long getIdProjetos() {
		return idProjetos;
	}
	/**
	 * @param idProjetos the idProjetos to set
	 */
	public void setIdProjetos(long idProjetos) {
		this.idProjetos = idProjetos;
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
	 * @return the dataInicio
	 */
	public Date getDataInicio() {
		return dataInicio;
	}
	/**
	 * @param dataInicio the dataInicio to set
	 */
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	/**
	 * @return the dataPrivsao
	 */
	public Date getDataPrivsao() {
		return dataPrivsao;
	}
	/**
	 * @param dataPrivsao the dataPrivsao to set
	 */
	public void setDataPrivsao(Date dataPrivsao) {
		this.dataPrivsao = dataPrivsao;
	}
	/**
	 * @return the dataFim
	 */
	public Date getDataFim() {
		return dataFim;
	}
	/**
	 * @param dataFim the dataFim to set
	 */
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the orcamento
	 */
	public Float getOrcamento() {
		return orcamento;
	}
	/**
	 * @param orcamento the orcamento to set
	 */
	public void setOrcamento(Float orcamento) {
		this.orcamento = orcamento;
	}
	/**
	 * @return the risco
	 */
	public String getRisco() {
		return risco;
	}
	/**
	 * @param risco the risco to set
	 */
	public void setRisco(String risco) {
		this.risco = risco;
	}
	
	
    
    
	

}
