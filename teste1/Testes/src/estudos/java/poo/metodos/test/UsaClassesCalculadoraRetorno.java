package estudos.java.poo.metodos.test;

import estudos.java.poo.metodos.dominio.CalculadoraRetorno;

public class UsaClassesCalculadoraRetorno {
    public static void main(String[] args) {
        CalculadoraRetorno calculadora = new CalculadoraRetorno();
        int resultado = calculadora.calcularNum(5,2);
        System.out.println(resultado);
    }


}
