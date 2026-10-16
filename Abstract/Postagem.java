package Abstract;

public class Postagem extends Publicacao implements  Compartilhavel{
    private int quantidadedecompartilhamentos;

    public Postagem(String autor , String conteudo , int curtidas , int quantidadedecompartilhamentos){
        super(autor , conteudo , curtidas);
        this.quantidadedecompartilhamentos = quantidadedecompartilhamentos;
    }

    public int getQuantidadedecompartilhamentos(){
        return quantidadedecompartilhamentos;
    }
    public void setQuantidadedecompartilhamentos(int quantidadedecompartilhamentos){
        this.quantidadedecompartilhamentos = quantidadedecompartilhamentos;
    }
    
    @Override 
    public void exibir(){
        System.out.println("Autor :" + getAutor()));
        System.out.println("Conteudo :" + getConteudo());
        System.out.println("Curitdas:" + getCurtidas());
        System.out.println("Compartilhadas :" + getQuantidadedecompartilhamentos());
    }

    @Override 
    public void compartilhar(){
        setQuantidadedecompartilhamentos(getQuantidadedecompartilhamentos() + 1);
    }
}
