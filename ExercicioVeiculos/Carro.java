public class Carro extends Veiculo {
    private String placa;


    public Carro(String marca , double tanque , double consumo , double velAtual , double LitTanque , double velMax , boolean estado , String placa){
        super(marca , tanque , consumo , velAtual , LitTanque , velMax , boolean estado);
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    @Override 
    public void acelerar(){
        if(getVelAtual() + 10 < getVelMax()){
            setVelAtual(getVelAtual() +10);
        }
    }
    @Override
    public void frear(){
        if(getVelAtual() - 5 > 0){
            setVelAtual(getVelAtual() - 5);
        }

    }
   @Override
    public void chavear() {
    while (getEstado() && getVelAtual() > 0) {
        frear();
    }
    setEstado(!getEstado());
}
    public void corrida (distancia , gasolina especial){
        
    }
}