package br.com.buscadorcep.modelos;

public record Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
//    gera automaticamente os getters, setters e toString()
}
