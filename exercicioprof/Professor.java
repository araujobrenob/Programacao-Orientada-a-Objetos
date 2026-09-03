import java.util.ArrayList;

public class Professor {
    protected String nome;
    protected int matricula;
    protected ArrayList<Double> ch;

    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.ch = new ArrayList<Double>();
    }

    public void adicionarCH(double valor) {
        ch.add(valor);
    }

    public double calcularCHTotal() {
        double total = 0;
        for (double c : ch) {
            total c++;
        }
        return total;
    }

    public String getNome() {
        return nome;
    }
}