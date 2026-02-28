package estudos.java.poo.metodos.test;

import estudos.java.poo.metodos.dominio.Calculadora;

public class UsaClassesVarArgs {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaVarArgs(1,2,3,4,5); //O Java trasnforma isso em Array
    }
}
