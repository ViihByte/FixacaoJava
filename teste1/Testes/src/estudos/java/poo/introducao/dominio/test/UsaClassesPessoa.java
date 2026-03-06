package estudos.java.poo.introducao.dominio.test;

import estudos.java.poo.introducao.dominio.Pessoa;

public class UsaClassesPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Vitoria";
        p1.idade = 20;
        p1.sexo = 'F';
        p1.Imprimir();
    }
}
