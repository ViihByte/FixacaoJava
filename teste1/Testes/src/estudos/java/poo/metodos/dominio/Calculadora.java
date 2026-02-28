package estudos.java.poo.metodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println("Soma: "+ (10+10));
    }

    //Metodo com parametro
    public void somaNumero(int num1){
        int soma = num1 + 2;
        System.out.println("A Soma: " + soma);
    }

    //Metodo com Retorno
    public int calcularNum(int num1, int num2){
        if (num2==0){
            return 0;
        }
        return num1 * num2;
    }

    //Com Void
    public void calculoDivisao(int num1, int num2){
        if(num2!=0){
            System.out.println(num1/num2);
            return;
        }
        System.out.println("Não exite divisão por zero!");
    }


    //VarArgs (No fim ele é um array tambem, só muda a chamada).
    // não pode ter outro tipo de atributo dentro do parametro. Se tiver, o VarArgs tem que ser por ultimo
    //Forma mais simples e pratica de um array no metodo
    public void somaVarArgs(int...numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
