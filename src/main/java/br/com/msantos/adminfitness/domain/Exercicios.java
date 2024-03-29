package br.com.msantos.adminfitness.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Exercicios extends GenericDomain {

	@Column(length = 50, nullable = false)
	private String descricao;

	@ManyToOne
	@JoinColumn(nullable = false)
	private CategoriaMuscular categoriaMuscular;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CategoriaMuscular getCategoriaMuscular() {
		return categoriaMuscular;
	}

	public void setCategoriaMuscular(CategoriaMuscular categoriaMuscular) {
		this.categoriaMuscular = categoriaMuscular;
	}

}
