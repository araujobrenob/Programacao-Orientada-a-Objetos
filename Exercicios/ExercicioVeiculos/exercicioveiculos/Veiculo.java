public class Veiculo {
    private String marca;
    private double tanque;
    private double consumo;
    private double velAtual;
    private double LitTanque;
    private double velMax;
    private boolean estado;
    
    public Veiculo (String marca , double tanque , double consumo , double velAtual , double LitTanque , double velMax , boolean estado){
        this.marca = marca;
        this.tanque = tanque;
        this.consumo = consumo;
        this.velAtual = velAtual;
        this.LitTanque = LitTanque;
        this.velMax = velMax;
        this.estado = estado;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public double getTanque(){
        return tanque;
    }
    public void setTanque(double tanque){
        this.tanque = tanque;
    }
    public double getConsumo(){
        return consumo;
    }
    public void setConsumo(double consumo){
        this.consumo = consumo;
    }
    public double getVelAtual(){
        return velAtual;
    }
    public void setVelAtual(double velAtual){
        this.velAtual = velAtual;
    }
    public double getLitTanque(){
        return LitTanque;
    }
    public void setLitTanque(double LitTanque){
        this.LitTanque = LitTanque;
    }
    public double getVelMax(){
        return velMax;
    }
    public void setVelMax(double velMax){
        this.velMax = velMax;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    

    public void chavear(boolean estado){
        this.estado = !this.estado;
    }

    public void acelerar(boolean estado , double velAtual , velMax){
        if(this.estado == true && this.velAtual < this.velMax){
            this.velAtual++;
        }

    }

    public void frear(){
        if(this.estado == true && this.velAtual > 0){
            this.velAtual --;
        }

    }
    public void  Corrida(double distancia){
        double litrosNecessarios = distancia/this.consumo;
        

        if(litrosNecessarios > this.LitTanque){
            this.velAtual = 0;
            this.LitTanque = 0;
            double kmNecessarios = consumo *(litrosNecessarios - this.LitTanque);
            System.out.println("quilometragem para completar o trajeto " +  String.format (kmNecessarios);
           
        }
        else{
                this.LitTanque - litrosNecessarios;
                System.out.println("litragem debitada:" + String.format("%.2f" , litrosNecessarios))
            }



            
        }

    }






}