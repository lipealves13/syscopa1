package controllers;

import models.Selecao;
import models.Tecnico;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SelecaoDao implements Dao<Selecao> {
    private List<Selecao> selecoes = new ArrayList<>();

    @Override
    public Optional<Selecao> get(long id) {
        return Optional.ofNullable(selecoes.get((int) id));
    }

    @Override
    public List<Selecao> getAll() {
        return selecoes;
    }

    @Override
    public void save(Selecao selecao) {
        selecoes.add(selecao);
    }

    @Override
    public void update(Selecao selecao, String[] params) {
        selecao.setNacionalidade(Objects.requireNonNull(
                params[0], "Nacionalidade não pode ser null"
        ));
        selecao.setGrupo(Objects.requireNonNull(
                params[1], "Grupo não pode ser null"
        ));
    }

    @Override
    public void delete(Selecao selecao) {
        selecoes.remove(selecao);
    }

    public Selecao buscaSelecao(String nacionalidadeSelecao) {
        for(int i=0;selecoes.size()>i;i++){
            Selecao selecao = selecoes.get(i);
            String codAux = selecao.getNacionalidade();
            if(codAux.equals(nacionalidadeSelecao)){
                return selecao;
            }
        }
        System.out.println("Código inválido ou selecao inexistente");
        return null;
    }
}
