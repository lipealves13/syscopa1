package models;

public class Jogador {
	//private String Nome;
	private String nome;
    private String nacionalidade;
    private int numeroDaCamisa;
    private String codJogador;
    private String Posicao;
    private int cartoesAmarelos;
    private int cartoesVermelhos;
    private int golsMarcados;

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCartoesAmarelos(int cartoesAmarelos) {
        this.cartoesAmarelos = cartoesAmarelos;
    }

    public void setCartoesVermelhos(int cartoesVermelhos) {
        this.cartoesVermelhos = cartoesVermelhos;
    }

    public void setCodJogador(String codJogador) {
        this.codJogador = codJogador;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public void setNumeroDaCamisa(int numeroDaCamisa) {
        this.numeroDaCamisa = numeroDaCamisa;
    }

    public void setPosicao(String posicao) {
        Posicao = posicao;
    }


    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    public int getCartoesVermelhos() {
        return cartoesVermelhos;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public int getNumeroDaCamisa() {
        return numeroDaCamisa;
    }

    public String getPosicao() {
        return Posicao;
    }

    public String getCodJogador() {
        return codJogador;
    }


}
