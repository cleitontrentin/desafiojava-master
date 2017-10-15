package br.com.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Membros {
	
	@Id
	@GeneratedValue
	private long idMemnbros;
	 
    @ManyToOne
    @JoinColumn(name = "idProjetos")
    private Projetos projetos;
    @ManyToOne
    @JoinColumn(name = "idPessoa")
    private Pessoa	pessoa;
    

}
