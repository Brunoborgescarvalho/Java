
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        //Estanciando a classe Aluno
        Aluno aluno = new Aluno();
        //setenado valores dos atributos
        aluno.setNome("Manoel Messias");
        aluno.setCpf("12345678900");
        aluno.setMatricula(123456);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getCpf());
        System.out.println(aluno.getMatricula());
        
    }
}
