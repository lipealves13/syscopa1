package controllers;

import models.Jogador;
import models.Tecnico;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class TecnicoDao implements Dao<Tecnico> {

    private List<Tecnico> tecnicos = new ArrayList<>();

    @Override
    public Optional<Tecnico> get(long id) {
        return Optional.ofNullable(tecnicos.get((int) id));
    }

    @Override
    public List<Tecnico> getAll() {
        return tecnicos;
    }

    @Override
    public void save(Tecnico tecnico) {
        tecnicos.add(tecnico);
    }

    @Override
    public void update(Tecnico tecnico, String[] params) {
        tecnico.setNome(Objects.requireNonNull(
                params[0], "Nome não pode ser null"
        ));
        tecnico.setNacionalidade(Objects.requireNonNull(
                params[1], "Nacionalidade não pode ser null"
        ));
    }

    @Override
    public void delete(Tecnico tecnico) {
        tecnicos.remove(tecnico);
    }

    public Tecnico buscaTecnicoNacionalidade(String nacionalidadeSelecao) {
        for(int i=0;tecnicos.size()>i;i++){
            Tecnico tecnico = tecnicos.get(i);
            String codAux = tecnico.getNacionalidade();
            if(codAux.equals(nacionalidadeSelecao)){
                return tecnico;
            }
        }
        System.out.println("Código inválido ou tecnico inexistente");
        return null;
    }
}
