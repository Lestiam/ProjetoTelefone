package br.com.newton.linguagem.aula03;

public class Telefone {
     //cria referencia a contato que instancia na classe agenda
     Contato contato;

     //Atributos
     public String marca;
     public String cor;

     //cria método de tocar
     public void Tocar(String estiloMusical){
          System.out.println("Tocando " + estiloMusical);
     }

     public void Ligar(Contato cont){
          System.out.println("Ligando para "+cont.nome);
     }
}
