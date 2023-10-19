package com.projeto.crudfarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.projeto.crudfarmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	List<Produto> findByNomeProdutoContainingIgnoreCase(@Param("nomeProduto")String nomeProduto);
}
