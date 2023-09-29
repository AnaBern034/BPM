import org.example.Pessoa;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TestarPessoa {
    @Test
    public void TestarSeObjetoNãoÉNull(){
     Pessoa pessoa = new Pessoa();
     Assert.assertNotNull(pessoa);
    }
    @Test
    public void TestarSetObjetoPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ana");

        Assert.assertEquals("Ana", pessoa.getNome());

    }
    @Test
    public void TestarSetIdPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setId(1);

        Assert.assertEquals(1, pessoa.getId());

    }
    @Test
    public void TestarMetodoValido(){
        Pessoa pessoa = new Pessoa(1,"Ana");
        Assert.assertTrue(pessoa.valido());

        Pessoa pessoaInvalido = new Pessoa();
        Assert.assertFalse(pessoaInvalido.valido());
    }

}
