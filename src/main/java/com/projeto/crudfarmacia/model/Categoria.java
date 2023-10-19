package com.projeto.crudfarmacia.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome da categoria não pode ser nulo.")
    @Size(min = 2, max = 255, message = "O nome da categoria não pode ser menor que 2 e ultrapassar 255 caracteres.")
	private String nome;
	
	@NotBlank(message = "A descição da categoria não pode ser nulo.")
    @Size(min = 10, max = 255, message = "A descição da categoria não pode ser menor que 10 e ultrapassar 255 caracteres.")
	private String descricao;

	@OneToMany(mappedBy = "idCategoria", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("idCategoria")
    private List<Produto> produtos; 
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
