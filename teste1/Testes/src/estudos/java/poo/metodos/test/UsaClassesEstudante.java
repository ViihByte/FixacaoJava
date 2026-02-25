package estudos.java.poo.metodos.test;

import estudos.java.poo.metodos.dominio.Estudante;
import estudos.java.poo.metodos.dominio.ImpressoraEstudante;

public class UsaClassesEstudante {
    public static void main(String[] args) {
        ImpressoraEstudante impressora = new ImpressoraEstudante();


        Estudante estudante01 = new Estudante();
        estudante01.nome = "Stefan";
        estudante01.idade = 17;
        estudante01.sexo= 'M';
        impressora.Imprime(estudante01);

        Estudante estudante02 = new Estudante();
        estudante02.nome = "Elena";
        estudante02.idade = 16;
        estudante02.sexo= 'F';
        impressora.Imprime(estudante02);
    }
}
