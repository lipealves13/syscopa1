package models;

import java.util.List;


public class Selecao {
    private String nacionalidade;
    private String grupo;
    private List<Jogador> jogadores;
    private Tecnico tecnico;

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public String getGrupo() {
        return grupo;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }
}
