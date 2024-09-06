package com.example.projetoescola.repositories;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.projetoescola.models.CategoriaCurso;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class CategoriaCursoRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public CategoriaCurso salvar(CategoriaCurso categoriaCurso) {
        categoriaCurso = entityManager.merge(categoriaCurso);
        return categoriaCurso;
    }

    public List<CategoriaCurso> obterTodos() {
        return entityManager.createQuery("SELECT c FROM categoriaCurso c", CategoriaCurso.class).getResultList();

    }

};
