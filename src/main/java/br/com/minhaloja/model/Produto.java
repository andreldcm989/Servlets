package br.com.minhaloja.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table(name="tb_produtos")
@Getter
public class Produto implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String marca;
	private double valor;
	private int quantidade;
	private LocalDateTime dataCriacao;
	
	public Produto() {
	}
	
	public Produto(String nome, String marca, double valor, int quantidade) {
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
		this.quantidade = quantidade;
		this.dataCriacao = LocalDateTime.now();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
