package br.com.newton.linguagem.aula03;
public class Telefone {
     //cria referencia a contato que instancia na classe agenda
     Contato contato;

     //Atributos
     public String marca;
     public String cor;

     //cria método de tocar
     public void Tocar(String estiloMusical){
          if(estiloMusical.equals("pagode"))
               System.out.println("Só tocamos pagode");
          else
               System.out.println("Tocando " + estiloMusical);
     }

     public void Ligar(Contato cont){
//          if(this.cor.equals("Preto"))
//               System.out.println("Ligando para "+cont.nome);
//          else
//               System.out.println("Telefone inválido");
          if(cont.nome.equals("Juliana"))
               System.out.println(this.cor.equals("Preto") ? "Ligando para "+cont.nome : "Telefone inválido");
     }

}
