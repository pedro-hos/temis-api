package com.sjcdigital.temis.model.entities.impl;

import java.math.BigInteger;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.sjcdigital.temis.model.entities.DefaultEntity;

/**
 * @author pedro-hos
 */

@Entity
public class Vereador extends DefaultEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(unique = true, nullable = false)
	private String nome;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "partido_politico_id")
	private PartidoPolitico partidoPolitico;
	
	private String info;
	private String email;
	private String legislatura;
	private String localTrabalho;
	private String foto;
	private String telefone;
	private Boolean vereadorNaoEncontrado = false;
	private BigInteger quantidadeLeis = BigInteger.ZERO;
	
	@OneToMany(mappedBy = "vereador")
	private Collection<Lei> leis;
	
	public Vereador() { }
	
	public Vereador(final String nome, final PartidoPolitico partidoPolitico) {
		this.nome = nome;
		this.partidoPolitico = partidoPolitico;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public PartidoPolitico getPartidoPolitico() {
		return partidoPolitico;
	}
	
	public void setPartidoPolitico(PartidoPolitico partidoPolitico) {
		this.partidoPolitico = partidoPolitico;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLegislatura() {
		return legislatura;
	}
	
	public void setLegislatura(String legislatura) {
		this.legislatura = legislatura;
	}
	
	public String getLocalTrabalho() {
		return localTrabalho;
	}
	
	public void setLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Boolean getVereadorNaoEncontrado() {
		return vereadorNaoEncontrado;
	}
	
	public void setVereadorNaoEncontrado(Boolean vereadorNaoEncontrado) {
		this.vereadorNaoEncontrado = vereadorNaoEncontrado;
	}
	
	public BigInteger getQuantidadeLeis() {
		return quantidadeLeis;
	}
	
	public void setQuantidadeLeis(BigInteger quantidadeLeis) {
		this.quantidadeLeis = quantidadeLeis;
	}

	/**
	 * @return the leis
	 */
	public Collection<Lei> getLeis() {
		return leis;
	}

	/**
	 * @param leis the leis to set
	 */
	public void setLeis(Collection<Lei> leis) {
		this.leis = leis;
	}
	
}