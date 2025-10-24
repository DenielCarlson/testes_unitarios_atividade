package com.facul.JUnitAtividade.repository;

import com.facul.JUnitAtividade.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}

