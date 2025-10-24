package com.facul.JUnitAtividade.service;

import com.facul.JUnitAtividade.model.Produto;
import com.facul.JUnitAtividade.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Produto atualizar(Long id, Produto produto) {
        if (repository.existsById(id)) {
            produto.setId(id);
            return repository.save(produto);
        }
        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
