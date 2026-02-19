package estudos.java.poo.dominio;

public class Pessoa {
    public String nome;
    public int idade;
    public char sexo;

    public void Imprimir(){
        System.out.printf("Nome: %s \nIdade: %d anos \nSexo: %c" , nome, idade, sexo);
    }
}
