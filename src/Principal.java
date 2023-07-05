import br.com.buscadorcep.modelos.ConsultaCep;
import br.com.buscadorcep.modelos.Endereco;

public class Principal {
    public static void main(String[] args) {
        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco("02550030");
        System.out.println(novoEndereco);
    }
}
