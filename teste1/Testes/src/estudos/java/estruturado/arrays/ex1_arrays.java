package estudos.java.estruturado.arrays;

public class ex1_arrays {
    public static void main(String[] args) {
        /* Não é primitivo, e sim refrences --> Tipo [] nome = array sendo objeto --> new Tipo [qntde];
             Sintaxe: Tipo [] nome = new Tipo[qntde];
        */
        int [] idades = new int[3];
        idades[0] = 15;
        idades[1] = 20;
        idades[2] = 21;
        System.out.println(idades[0]);

    }
}
