package com.edilson.bookstore.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.edilson.bookstore.domain.Categoria;

public class CategoriaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	@NotEmpty(message = "Campo nome e requerido")
	@Length(min = 3, max = 100, message = "O campo nome deve ter entre 3 a 100 caracteres")
	private String nome;
	
	@NotEmpty(message = "Campo descricao e requerido")
	@Length(min = 3, max = 200, message = "O campo descricao deve ter entre 3 a 200 caracteres")
	private String descricao;
	public CategoriaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoriaDTO(Categoria obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	
}
