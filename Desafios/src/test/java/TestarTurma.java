import org.example.Pessoa;
import org.example.Turma;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestarTurma {

    @Test
    public void testarExceptionObjetoPessoaInvalido() throws Exception {
        Pessoa pessoa = new Pessoa();
        Turma turma = new Turma();

        String expect = "Objeto pessoa inválido";
        try {
            turma.adicionarPessoa(pessoa);
            fail("Deveria lançar uma exceção");
        }catch (Exception e) {
            assertEquals(expect, e.getMessage());
        }

    }

    @Test
    public void testarExceptionObjetoPessoaJaEstaAtribuidoATurma() throws Exception{
        Pessoa pessoa = new Pessoa(1,"Marcia");
        Pessoa pessoa1 = new Pessoa(1,"Marcia");
        Turma turma = new Turma();
        turma.adicionarPessoa(pessoa);
        String result = "Objeto pessoa já está atribuido a turma";

        try {
            turma.adicionarPessoa(pessoa1);
            fail("Deveria lançar exceção");
        }catch (Exception e){
            assertEquals(result,e.getMessage());
        }

    }

    @Test
    public void testarRemoverPessoas() throws Exception{

        Turma turma = new Turma();

        turma.adicionarPessoa(new Pessoa(1,"Marcia"));
        turma.adicionarPessoa(new Pessoa(2,"Larissa"));
        turma.adicionarPessoa(new Pessoa(3,"Ana"));

        turma.removerTodasPessoas();

       assertTrue(turma.getPessoas().isEmpty());


    }

}
