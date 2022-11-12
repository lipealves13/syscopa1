package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import models.Arbitro;

import org.junit.jupiter.api.Test;



class ArbitroTest {

    Arbitro arbitro = new Arbitro();

    @Test
    public void arbitroTest() {
        arbitro.setNome("Daronco");
        assertEquals(arbitro.getNome(),"Daronco");
        arbitro.setNacionalidade("BRASIL");
        assertEquals(arbitro.getNacionalidade(),"BRASIL");
    }

}
