import br.com.buscadorcep.modelos.ConsultaCep;
import br.com.buscadorcep.modelos.Endereco;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o número do CEP para consulta:");
        var cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Aplicação finalizada.");
        }


    }
}
