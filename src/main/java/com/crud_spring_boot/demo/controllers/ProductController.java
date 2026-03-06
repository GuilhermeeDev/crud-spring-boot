package com.crud_spring_boot.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud_spring_boot.demo.repository.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.crud_spring_boot.demo.entity.Product;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/produtos")
public class ProductController {
    
    // Conectando o repositório para acessar os dados dos produtos.
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/criar")
    public Product criarProduto(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/listar")
    public List<Product> listarTodosProdutos() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product listarPeloId(@RequestParam Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Product atualizarProduto(@PathVariable Long id, @RequestBody Product product) {
        Product _product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        _product.setNome(product.getNome());
        _product.setDescricao(product.getDescricao());
        _product.setPreco(product.getPreco());
        _product.setQuantidade(product.getQuantidade());
        return productRepository.save(_product);
    }
    
    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){
        productRepository.deleteById(id);
    }

}
