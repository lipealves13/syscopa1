package controllers;

import models.Partida;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PartidaDao implements Dao<Partida> {

    private List<Partida> partidas = new ArrayList<>();

    @Override
    public Optional<Partida> get(long id) {
        return Optional.ofNullable(partidas.get((int) id));
    }

    @Override
    public List<Partida> getAll() {
        return partidas;
    }

    @Override
    public void save(Partida partida) {
        partidas.add(partida);
    }

    @Override
    public void update(Partida partida, String[] params) {

    }

    @Override
    public void delete(Partida partida) {
        partidas.remove(partida);
    }

    public Partida buscaPartida(String partida){
        for(int i=0;partidas.size()>i;i++){
            Partida partidax = partidas.get(i);
            String codAuxA = partidax.getSelecaoA().getNacionalidade();
            String codAuxB = partidax.getSelecaoB().getNacionalidade();
            if((codAuxA+codAuxB).equals(partida)) {
                return partidax;
            }
        }
        System.out.println("Partida não encontrada ou inexistente");
        return null;
    }
}
