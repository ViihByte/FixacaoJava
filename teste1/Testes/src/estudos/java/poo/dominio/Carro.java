package estudos.java.poo.dominio;

public class Carro {
    public String nome;
    public String modelo;
    public int ano;

    public void Imprimir(){
        System.out.format("%s - %s - %d\n", nome, modelo, ano);
    }

}
