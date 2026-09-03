public class Atendimento {
    private String dia;
    private double horario;

    public Atendimento(String dia, double horario) {
        this.dia = dia;
        this.horario = horario;
    }

    public double getHorario() {
        return horario;
    }

    public String getDia() {
        return dia;
    }
}