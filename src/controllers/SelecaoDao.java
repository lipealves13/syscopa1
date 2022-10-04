package controllers;

import models.Selecao;
import models.Tecnico;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SelecaoDao implements Dao<Selecao> {
    private List<Selecao> selecoes = new ArrayList<>();

    @Override
    public Optional<Selecao> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Selecao> getAll() {
        return null;
    }

    @Override
    public void save(Selecao selecao) {
        selecoes.add(selecao);
    }

    @Override
    public void update(Selecao selecao, String[] params) {

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
