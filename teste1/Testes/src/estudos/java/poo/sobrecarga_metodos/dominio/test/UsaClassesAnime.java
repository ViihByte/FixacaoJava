package estudos.java.poo.sobrecarga_metodos.dominio.test;

import estudos.java.poo.sobrecarga_metodos.dominio.Anime;

public class UsaClassesAnime {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        anime1.init("Attack on Titan", "TV", 12, "Terror");
        anime1.imprime();
    }
}

/*  Sobrecarga de Meodos: Os metodos contendo o mesmo nome, porem, com quantidades e parametros diferentes.
   Assim, não causa erros por parametros faltando. Contendo varias alternativas de imprimir o resultado  */
