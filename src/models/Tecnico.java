package models;

public class Tecnico {
    private String nome;
    private String nacionalidade;

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getNome() {
        return nome;
    }
}
