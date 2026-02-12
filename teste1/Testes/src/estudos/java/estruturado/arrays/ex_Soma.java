package estudos.java.estruturado.arrays;

public class ex_Soma {
    public static void main(String[] args) {
        /*int[] numeros = {10,20,30,40,50};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "; ");
            soma += numeros[i];
        }

        System.out.println("\nSoma = " + soma);
    }*/
        int[] numeros = {5,3,8};
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "; ");
            soma += numeros[i];
        }

        System.out.println("\nSoma: " + soma);
    }
}