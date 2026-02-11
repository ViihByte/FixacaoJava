package estudos.java.estruturado.repeticoes;

public class ex_doWhile {
    public static void main(String[] args) {
        //Executa pelo menos 1 vez, mesmo se a condição for falsa.
        int count = 0;

        do{
            System.out.println("Dentro do Do-While");
        }
        while (count == 5);
    }
}
