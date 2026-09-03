public class Estudante {
    private String nome;
    private int matricula;
    private double mensalidade;
    protected int idade;


    public Estudante(String nome, int matricula, double mensalidade , int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.mensalidade = mensalidade;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
}

    public double getMensalidade() {
        return mensalidade;
    }
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public void entrarEmaula(){
        System.out.println("O estudante " + nome + " entrou na aula.");
    }

    public void sairDaAula(){
        System.out.println("O estudante " + nome + " saiu da aula.");
    }
}