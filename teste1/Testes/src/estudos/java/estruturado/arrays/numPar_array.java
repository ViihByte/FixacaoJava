package estudos.java.estruturado.arrays;

public class numPar_array {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            boolean numerosPares = numeros[i] % 2 == 0;
            if (numerosPares) {
                System.out.println("Pares:" + numeros[i]);
                contador++;
            } else {
                System.out.println("Impares: " + numeros[i]);
            }

        }
        System.out.println("Há " + contador + " numeros Pares");
    }
}