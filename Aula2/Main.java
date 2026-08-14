package Aula2;

public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa(nome : "joao" , idade :17 , peso :50.35);
        System.out.println(p1);
        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.peso);

        Pessoa p2 = p1;

        System.out.println(p2);
        p2.nome = "carlos";
        System.out.println(p1.nome);   

        p1.apresentacao;
         }
}