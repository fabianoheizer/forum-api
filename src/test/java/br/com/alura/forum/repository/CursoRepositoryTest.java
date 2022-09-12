package br.com.alura.forum.repository;

import br.com.alura.forum.ForumTestsBase;
import br.com.alura.forum.modelo.Curso;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class CursoRepositoryTest extends ForumTestsBase {

    @Autowired
    private CursoRepository repository;

    @Test
    public void carregarUmCurso(){
        String nomeCurso = "Java";
        Curso curso = repository.findByNome(nomeCurso);
        Assertions.assertEquals(nomeCurso, curso.getNome());
    }
}