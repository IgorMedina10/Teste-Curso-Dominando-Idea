package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O gato das Botas", 300);
        System.out.println(livro1);

        int a = 5;
        int b = 3;
        System.out.println("Hello World " + (a+b));
    }

    static class Livro {

        private String nome;
        private Integer numpages;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumpages() {
            return numpages;
        }

        public void setNumpages(Integer numpages) {
            this.numpages = numpages;
        }

        public Livro(String nome, Integer numpages) {
            this.nome = nome;
            this.numpages = numpages;


        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numpages=" + numpages +
                    '}';
        }
    }
}
