package estudos.java.estruturado.condicionais;

import java.util.Scanner;

public class ex02_elif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        String categoria;

        if(idade < 15){
            categoria = "Categoria Infantil";
        }

        else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }

        else{
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);
    }
}
