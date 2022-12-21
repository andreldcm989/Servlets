package br.com.minhaloja.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table(name="tb_produtos")
public class Produto implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String marca;
	private double valor;
	private int quantidade;
	private Date dataCriacao;
	private double total;
	
	public Produto() {
	}
	
	public Produto(String nome, String marca, double valor, int quantidade) {
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
		this.quantidade = quantidade;
		this.dataCriacao = new Date();
		setTotal();
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getMarca() {
		return marca;
	}

	public double getValor() {
		return valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public double getTotal() {
		return total;
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
	
	public void setTotal() {
		this.total = valor * quantidade;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s | Marca: %s | Valor: R$ %.2f | Qtde: %d | Total: R$ %.2f | Criado em %6$te/%6$tm/%6$tY", nome, marca, valor, quantidade, total, dataCriacao);
	}
}
