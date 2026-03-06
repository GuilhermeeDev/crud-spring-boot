package com.crud_spring_boot.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

// Especificando que é uma entidade do banco de dados.
@Entity
public class Product {
    // Propriedades da entidade Product.
    
    // Gerar o ID automaticamente, com autoincrement.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do produto é obrigatório")
    @Column(nullable = false, length = 100)
    private String nome;
    
    @Column(length = 500)
    private String descricao;

    @Column(nullable = false)
    private Double preco;

    @Column(nullable = false)
    private Integer quantidade;

    // Construtor vazio necessário para o JPA.
    public Product() {}

    // Construtor com parâmetros para facilitar a criação de objetos.
    public Product(String nome, String descricao, Double preco, Integer quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade; 
    }

    // Getters e Setters para acessar e modificar as propriedades.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public Double getPreco(){
        return preco;
    }

    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    }

    public Integer getQuantidade(){
        return quantidade;
    }
    
}
