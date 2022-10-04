package controllers;

import models.Arbitro;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ArbitroDao implements Dao<Arbitro> {

    private List<Arbitro> arbitros = new ArrayList<>();

    @Override
    public Optional<Arbitro> get(long id) {

        return Optional.ofNullable(arbitros.get((int) id));
    }

    @Override
    public List<Arbitro> getAll() {
        return arbitros;
    }

    @Override
    public void save(Arbitro arbitro) {
        arbitros.add(arbitro);
    }

    @Override
    public void update(Arbitro arbitro, String[] params) {
        arbitro.setNome(Objects.requireNonNull(
                params[0], "Nome não pode ser null"
        ));
        arbitro.setNacionalidade(Objects.requireNonNull(
                params[1], "Nacionalidade não pode ser null"
        ));
        arbitros.add(arbitro);
    }

    @Override
    public void delete(Arbitro arbitro) {
        arbitros.remove(arbitro);
    }
}
