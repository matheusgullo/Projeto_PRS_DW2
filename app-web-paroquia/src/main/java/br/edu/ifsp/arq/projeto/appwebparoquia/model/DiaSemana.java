package br.edu.ifsp.arq.projeto.appwebparoquia.model;

public enum DiaSemana {
	DOMINGO("Domingo"),
	SEGUNDA("Segunda-feira"),
	TERCA("Terça-feira"),
	QUARTA("Quarta-feira"),
	QUINTA("Quinta-feira"),
	SEXTA("Sexta-feira"), 
	SABADO("Sábado");
	
	private String descricao;
	
	private DiaSemana(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
