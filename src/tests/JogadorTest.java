package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import models.Jogador;
import org.junit.jupiter.api.Test;



class JogadorTest {

    Jogador jogador = new Jogador();

    @Test
    public void jogadorTest() {
        jogador.setNome("Vini Jr");
        assertEquals(jogador.getNome(),"Vini Jr");
        jogador.setCodJogador("BRASIL20");
        assertEquals(jogador.getCodJogador(),"BRASIL20");
        jogador.setCartoesVermelhos(2);
        assertEquals(jogador.getCartoesVermelhos(),2);
        jogador.setPosicao("Atacante");
        assertEquals(jogador.getPosicao(),"Atacante");
        jogador.setCartoesAmarelos(2);
        assertEquals(jogador.getCartoesAmarelos(),2);
        jogador.setNacionalidade("BRASIL");
        assertEquals(jogador.getNacionalidade(),"BRASIL");
        jogador.setNumeroDaCamisa(20);
        assertEquals(jogador.getNumeroDaCamisa(),20);
        jogador.setGolsMarcados(23);
        assertEquals(jogador.getGolsMarcados(),23);
    }

}
