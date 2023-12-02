package pasta;
public class Aluno{
    private String nome;
    private String CPF;
    private int matricula;
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCpf(String cpf){
        this.CPF=cpf;
    }
    
    public String getCpf(){
        return this.CPF;
    }
    
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
}