package com.devsenai2A.petshop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsenai2A.petshop.entities.Categoria;
import com.devsenai2A.petshop.repositories.CategoriaRepository;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> listar() {
        return repository.findAll();
    }

    public Categoria salvar(Categoria categoria) {
        return repository.save(categoria);
    }

    public Categoria atualizar(Integer id, Categoria categoria) {
        categoria.setId_categoria(id);
        return repository.save(categoria);
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }
}