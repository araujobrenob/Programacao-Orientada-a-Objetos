package Library;

import java.util.ArrayList;

public class Leitor {
    private String nome;
    private int matricula;
    private int idade;
    private boolean[] bloqueado;
    private ArrayList<Livro> livrosEmprestados;


    public Leitor(String nome , int matricula , int idade , boolean[] bloqueado ,ArrayList<Livro> livrosemprestados){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.bloqueado = bloqueado;
        this.livrosEmprestados = new ArrayList();
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public boolean getBloqueado(){
        return bloqueado;
    }
    public void setBloqueado(boolean[] bloqueado){
        this.bloqueado = bloqueado;
    }
    public List<Livro> getLivrosEmprestados(){
        return livrosEmprestados;
    }
    public void setLivrosEmprestados(List<Livro> livrosEmprestados){
        this.livrosEmprestados = livrosEmprestados;
    }

    public void emprestarLivros(Livro livro){
        if (getDisponibilidade(livro) && !getBloqueado){
            livrosEmprestados.add(livro);
            setQtdDisponivel(qtdDisponivel - 1);
        }
        if (getQtdDisponvel() < 1){
            setDisponibilidade(
        }

    }
    

    
}
