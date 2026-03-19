package estudos.java.poo.construtores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String studio;


    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    //Construtores não tem nenhum tipo de retorno
    public Anime(String nome, String tipo, String genero, int episodios){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios = episodios;
    }

    public Anime(){
        System.out.println("Dentro de construtor sem parametro");
    }

    public Anime(String nome, String tipo, String genero, int episodios, String studio){
        this(nome, tipo, genero, episodios);
        this.studio = studio;
    }



    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.studio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}


