package br.com.newton.linguagem.aula03;

public class Agenda {
    public static void main(String[] args) {

        //Criando um objeto telefone utilizando um construtor
        //sem parâmetro padrão
        Telefone telefone = new Telefone();
        Contato contato = new Contato();
        contato.nome = "Igor";
        contato.numero = "222255";

        telefone.contato = contato;

        System.out.println(telefone.contato.nome);
        System.out.println(telefone.contato.numero);


    }
}
