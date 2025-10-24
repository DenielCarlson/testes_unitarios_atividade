package com.facul.JUnitAtividade.service;

import com.facul.JUnitAtividade.model.Produto;
import com.facul.JUnitAtividade.repository.ProdutoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProdutoServiceTest {

    @Mock
    private ProdutoRepository repository;

    @InjectMocks
    private ProdutoService service;

    private Produto produto;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        produto = new Produto(1L, "Notebook", "Notebook Dell", 4500.0, 10);
    }

    @Test
    void deveSalvarProduto() {
        when(repository.save(any())).thenReturn(produto);
        Produto salvo = service.salvar(produto);
        assertEquals("Notebook", salvo.getNome());
    }

    @Test
    void deveListarTodos() {
        when(repository.findAll()).thenReturn(Arrays.asList(produto));
        List<Produto> lista = service.listarTodos();
        assertEquals(1, lista.size());
    }

    @Test
    void deveBuscarPorId() {
        when(repository.findById(1L)).thenReturn(Optional.of(produto));
        Optional<Produto> encontrado = service.buscarPorId(1L);
        assertTrue(encontrado.isPresent());
    }

    @Test
    void deveAtualizarProdutoExistente() {
        when(repository.existsById(1L)).thenReturn(true);
        when(repository.save(any())).thenReturn(produto);
        Produto atualizado = service.atualizar(1L, produto);
        assertNotNull(atualizado);
    }

    @Test
    void deveDeletarProduto() {
        doNothing().when(repository).deleteById(1L);
        service.deletar(1L);
        verify(repository, times(1)).deleteById(1L);
    }
}

