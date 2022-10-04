package models;

public class Arbitro {
    private String Nome;
    private String Nacionalidade;

    public void setNacionalidade(String nacionalidade) {
        Nacionalidade = nacionalidade;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public String getNome() {
        return Nome;
    }
}
