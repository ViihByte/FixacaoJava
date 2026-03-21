package estudos.java.poo.modificadorEstatico.test;

import estudos.java.poo.modificadorEstatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setLimiteVelocidade(180);
        Carro c1 = new Carro("BMW", 150);
        c1.imprime();
        Carro c2 = new Carro("Porshe", 120);
        c2.imprime();
        Carro c3 = new Carro("Volvo", 30);
        c3.imprime();
    }
}
