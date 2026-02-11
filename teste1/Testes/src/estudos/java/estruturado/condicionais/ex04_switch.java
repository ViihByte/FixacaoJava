package estudos.java.estruturado.condicionais;

import java.util.Scanner;

public class ex04_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        String diaSemana = sc.next();

        switch (diaSemana) {
            case "Sunday":
                diaSemana = "Domingo";
                break;
            case "Monday":
                diaSemana = "Segunda-Feira";
                break;
            case "Tuersday":
                diaSemana = "Terça-Feira";
                break;
            case "Wednesday":
                diaSemana = "Quarta-Feira";
                break;
            case "Thuersday":
                diaSemana = "Quinta_Feira";
                break;
            case "Friday":
                diaSemana = "Sexta-Feira";
                break;
            case "Saturday":
                diaSemana = "Sabado";
                break;
            default:
                System.out.println("não existe");
                break;
        }
        System.out.println(diaSemana);

    }
}
