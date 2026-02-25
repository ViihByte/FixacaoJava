package estudos.java.poo.metodos.dominio;

public class ImpressoraEstudante {
    public void Imprime(Estudante estudante){
        System.out.println("Nome:" + estudante.nome + "\nIdade: " + estudante.idade + "\nSexo:" + estudante.sexo + "\n----------");
    }
}
