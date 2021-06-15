package com.desafios.periodosperdidos2.services;

import com.previred.desafio.tres.uf.Valores;
import com.previred.desafio.tres.uf.vo.Ufs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for periodosperdidos2
 * @author Jesus Alcala
 */
class RancoFechaServiceTest {

    IRangosFechasService iRangosFechasService = new RancoFechaService();

    @Test
    void getUfsComplete() {
        Valores valores = new Valores();
        Ufs ufs = valores.getRango();
        ufs =iRangosFechasService.getUfsComplete(ufs);

        assertNotNull(ufs);
    }
}