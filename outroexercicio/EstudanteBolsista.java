public class EstudanteBolsista extends Estudante {
    private double desconto;

    public EstudanteBolsista(String nome, int matricula, double mensalidade, double desconto , int idade) {
        super(nome, matricula, mensalidade , idade);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double calculaMensalidade(){
        double novaMensalidade = super.getMensalidade() -  (super.getMensalidade() * desconto);
        System.out.println("o aluno" + super.getNome() + " tem um desconto de " + (desconto * 100) + "% e sua nova mensalidade é: " + novaMensalidade);
        return novaMensalidade;
    }


  
}