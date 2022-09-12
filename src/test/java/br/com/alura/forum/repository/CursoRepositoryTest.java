package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Curso;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CursoRepositoryTest {

    @Autowired
    private CursoRepository repository;

    @Test
    public void carregarUmCurso(){
        String nomeCurso = "Java";
        Curso curso = repository.findByNome(nomeCurso);
        Assertions.assertEquals(nomeCurso, curso.getNome());
    }
}