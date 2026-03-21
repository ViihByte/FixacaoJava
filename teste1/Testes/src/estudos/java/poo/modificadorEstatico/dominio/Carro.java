package estudos.java.poo.modificadorEstatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMax;
    public static double limiteVelocidade = 250;

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;

    }

    public static void setLimiteVelocidade(double limiteVelocidade){
        Carro.limiteVelocidade = limiteVelocidade;
    }

    public static double getLimiteVelocidade(){
        return Carro.limiteVelocidade;
    }

    public void imprime(){
        System.out.println("----------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade maxima " + this.velocidadeMax);
        System.out.println("Limite de velocidade " + Carro.limiteVelocidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }


}
