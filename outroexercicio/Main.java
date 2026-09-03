public class Main {}

public static void main(String[] args) {
    Estudante e = new Estudante("João", 12345, 500.0);
    e.entrarEmaula();                                                                      
    e.sairDaAula();


    EstudanteBolsista eb = new EstudanteBolsista("Maria", 67890, 400.0, 0.2);
    eb.entrarEmaula();
    eb.sairDaAula();
}

System.out.println(e Instance of Estudante);
System.out.println(eb Instance of EstudanteBolsista);
System.out.println(e instance of EstudanteBolsista);
System.out.println(eb instance of Estudante);


System.out.println("Mensalidade do aluno " + eb.getMensalidade())