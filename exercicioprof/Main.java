public class Main {
    public static void main(String[] args) {
        Coordenador c1 = new Coordenador("Ricardo", 3001, "Núcleo de Exatas");

    
        c1.adicionarCH(4.0);
        c1.adicionarCH(6.0);
        System.out.println("CH Total: " + c1.calcularCHTotal());

        
        c1.adicionarAtendimento(new Atendimento("Segunda", 2.0));
        c1.adicionarAtendimento(new Atendimento("Quarta", 1.5));
        System.out.println("Horas de atendimento: " + c1.somaHorasAtendimento()); 

        System.out.println("Nome: " + c1.getNome()); 
    }
}