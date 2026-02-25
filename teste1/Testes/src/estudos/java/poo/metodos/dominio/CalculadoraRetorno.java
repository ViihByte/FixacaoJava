package estudos.java.poo.metodos.dominio;

public class CalculadoraRetorno {
    public int calcularNum(int num1, int num2){
        if (num2==0){
            return 0;
        }
        return num1 * num2;
    }
}
