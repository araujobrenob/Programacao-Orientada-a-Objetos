import java.util.ArrayList;

public class Coordenador extends Professor {
    private String nucleo;
    private ArrayList<Atendimento> atendimentos;

    public Coordenador(String nome, int matricula, String nucleo) {
        super(nome, matricula);
        this.nucleo = nucleo;
        this.atendimentos = new ArrayList<Atendimento>();
    }

    public void adicionarAtendimento(Atendimento a) {
        atendimentos.add(a);
    }

    public double somaHorasAtendimento() {
        double total = 0;
        for (Atendimento a : atendimentos) {
            total += a.getHorario();
        }
        return total;
    }
}