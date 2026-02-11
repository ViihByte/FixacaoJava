package estudos.java.estruturado.repeticoes;

public class ex_break {
    public static void main(String[] args) {
        //Imprimir os primeiros 25 numeros
        int valorMax = 50;
        int aMostrar = 25;
        for (int i = 0; i <= valorMax; i++) {
            if (i>aMostrar){
                break;
            }
            System.out.println(i);
            }

    }
}
