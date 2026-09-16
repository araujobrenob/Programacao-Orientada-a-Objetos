public class Aviao extends Veiculo{
    private boolean voando;


    public Aviao(String marca , double tanque , double consumo , double velAtual , double LitTanque , double velMax , boolean estado , boolean voando){
        this.voando = voando;
    }

    public boolean getVoando(){
        return voando;
    }
    public void setVoando(boolean voando){
        this.voando = voando;
    }

    public void voar(){
        if(getVelAtual() >=200){
            setVoando(true);
        
        }
    }
   
    @Override
    public void chavear(){
        if (getEstado() && getVelAtual() > 0){
            System.out.println("o avião está voando e não pode ser desligado");
        }
        else{
            setEstado(!getEstado());
        }
       
        }
    @Override
    public void corrida(double distancia){
        if (distancia > getConsumo() * getLitTanque()){
            System.out.println("o aviao devera fazer seu pouso de emergencia");
            setVoando(false);
        }
        else{
            super.corrida(distancia);
        }

    }
    }
}