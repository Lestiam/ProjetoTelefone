package br.com.newton.linguagem.aula03;

public class Agenda {
    public static void main(String[] args) {

        //Criando um objeto telefone utilizando um construtor
        //sem parâmetro padrão
        Telefone telefone = new Telefone();
        Contato contato = new Contato();

        Contato contato2 = new Contato();
        Telefone telefone2 = new Telefone();

        Contato contato3 = new Contato();
        Telefone telefone3 = new Telefone();

        contato.nome = "Juliana";
        contato.numero = "222255";
        telefone.contato = contato;


        telefone2.contato = contato2;//associa o telefone 2 ao contato 2
        contato2.nome = "João";
        contato2.numero = "318989952";
        telefone2.marca = "IPhone";
        telefone2.cor = "Azul";

        telefone3.contato = contato3;//associa o telefone 3 ao contato 3
        contato3.nome = "Carmem";
        contato3.numero = "3189871147";
        telefone3.marca = "S20";
        telefone3.cor = "Preto";

        System.out.println(telefone2.contato.nome);
        System.out.println(telefone2.contato.numero);
        System.out.println(telefone2.marca);
        System.out.println(telefone2.cor);
        telefone2.Tocar("Forró");
        telefone2.Ligar(contato3);


        System.out.println("\n");

        System.out.println(telefone3.contato.nome);
        System.out.println(telefone3.contato.numero);
        System.out.println(telefone3.marca);
        System.out.println(telefone3.cor);
        telefone3.Tocar("pagode");
        telefone3.Ligar(contato);




    }
}
