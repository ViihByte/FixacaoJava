package estudos.java.poo.test;

import estudos.java.poo.dominio.Carro;

public class UsaClassesCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.nome = "Ferrari";
        c1.modelo = "488 GTB";
        c1.ano = 2019;
        c1.Imprimir();

        Carro c2 = new Carro();
        c2.nome = "Porshe";
        c2.modelo = "911 Carrera S";
        c2.ano = 2022;
        c2.Imprimir();
    }
}
