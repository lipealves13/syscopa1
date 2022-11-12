package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import models.Jogador;
import models.Selecao;

import models.Tecnico;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


class SelecaoTest {

    Selecao selecao = new Selecao();
    Jogador jogador = new Jogador();
    Tecnico tecnico = new Tecnico();

    private List<Jogador> jogadores = new ArrayList<>();


    @Test
    public void selecaoTest() {
        jogadores.add(jogador);
        selecao.setNacionalidade("BRASIL");
        assertEquals(selecao.getNacionalidade(),"BRASIL");
        selecao.setGrupo("A");
        assertEquals(selecao.getGrupo(),"A");
        selecao.setTecnico(tecnico);
        assertEquals(selecao.getTecnico(),tecnico);
        selecao.setJogadores(jogadores);
        assertEquals(selecao.getJogadores(),jogadores);

    }

}
