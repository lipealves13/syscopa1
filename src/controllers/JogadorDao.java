package controllers;

import models.Jogador;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.lang.Integer.parseInt;

public class JogadorDao implements Dao<Jogador>{

    private List<Jogador> jogadores = new ArrayList<>();

    @Override
    public Optional<Jogador> get(long id) {
        return Optional.ofNullable(jogadores.get((int) id));
    }

    @Override
    public List<Jogador> getAll() {
        return jogadores;
    }

    @Override
    public void save(Jogador jogador) {
        jogadores.add(jogador);
    }

    @Override
    public void update(Jogador jogador, String[] params) {
        jogador.setNome(Objects.requireNonNull(
                params[0], "Nome não pode ser null"
        ));
        jogador.setNacionalidade(Objects.requireNonNull(
                params[1], "Nacionalidade não pode ser null"
        ));
        jogador.setNumeroDaCamisa(Objects.requireNonNull(
                parseInt(params[2]), "Numero da camisa não pode ser null"
        ));
        jogador.setCodJogador(params[1]+params[2]);

        jogador.setPosicao(Objects.requireNonNull(
                params[5], "Posição não pode ser null"
        ));
        jogador.setCartoesAmarelos(Objects.requireNonNull(
                parseInt(params[6]), "Numero de cartões amarelos não pode ser null"
        ));
        jogador.setCartoesVermelhos(Objects.requireNonNull(
                parseInt(params[7]), "Numero de cartões vermelhos não pode ser null"
        ));
        jogador.setGolsMarcados(Objects.requireNonNull(
                parseInt(params[8]), "Numero de gols marcados não pode ser null"
        ));

        jogadores.add(jogador);
    }

    @Override
    public void delete(Jogador jogador) {
        jogadores.remove(jogador);
    }
    public Jogador buscaJogadorCod(String Cod){
        for(int i=0;jogadores.size()>i;i++){
            Jogador jogador = jogadores.get(i);
            String codAux = jogador.getCodJogador();
            if(codAux.equals(Cod)){
                return jogador;
            }
        }
        System.out.println("Código inválido ou jogador inexistente");
        return null;
    }
    public List<Jogador> buscaJogadorNacionalidade(String Nac){
        for(int i=0;jogadores.size()>i;i++){
            List<Jogador>  jogadoresSelecao = new ArrayList<>();
            Jogador jogador = jogadores.get(i);
            String NacAux = jogador.getNacionalidade();
            if(NacAux.equals(Nac)){
                jogadoresSelecao.add(jogador);
                return jogadoresSelecao;
            }
        }
        System.out.println("Código inválido ou jogador inexistente");
        return null;
    }

}
