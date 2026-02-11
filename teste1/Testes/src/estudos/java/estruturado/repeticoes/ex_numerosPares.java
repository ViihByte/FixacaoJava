package estudos.java.estruturado.repeticoes;

public class ex_numerosPares {
    public static void main(String[] args) {
        //Imprimir todos os numeros pares de 0 até 1000000
        int limiteMax=1000000;
        for(int i = 0; i <= limiteMax; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }

        }
    }
}
