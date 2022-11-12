package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import models.Tecnico;
import org.junit.jupiter.api.Test;



class TecnicoTest {

    Tecnico tecnico = new Tecnico();

    @Test
    public void tecnicoTest() {
        tecnico.setNome("TITE");
        assertEquals(tecnico.getNome(),"TITE");

        tecnico.setNacionalidade("BRASIL");
        assertEquals(tecnico.getNacionalidade(),"BRASIL");

    }

}
