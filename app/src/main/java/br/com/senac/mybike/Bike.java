package br.com.senac.mybike;

public class Bike {
    //atributos globais
    private String titulo;
    private String preco;
    private String disponivel;
    private int imagemBike;

    public Bike() {
    }

    public Bike(String titulo, String preco, String disponivel, int imagemBike) {
        this.titulo = titulo;
        this.preco = preco;
        this.disponivel = disponivel;
        this.imagemBike = imagemBike;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }

    public int getImagemBike() {
        return imagemBike;
    }

    public void setImagemBike(int imagemBike) {
        this.imagemBike = imagemBike;
    }
}
