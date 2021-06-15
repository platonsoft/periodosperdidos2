package com.desafios.periodosperdidos2;

import com.desafios.periodosperdidos2.services.IRangosFechasService;
import com.desafios.periodosperdidos2.services.RancoFechaService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.previred.desafio.tres.uf.Valores;
import com.previred.desafio.tres.uf.vo.Ufs;
import org.apache.log4j.Logger;

/**
 * Solucion Ejercicio 2 Desafio 3
 * @author Jesus Alcala
 * @version 1.0.0
 */
public class PeriodosPerdidosApplication {
    static final Logger logger = Logger.getLogger(PeriodosPerdidosApplication.class);
    static final IRangosFechasService iRangosFechasService = new RancoFechaService();

    public static void main(String[] args) {
        Valores valores = new Valores();
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

        logger.info(IRangosFechasService.MESSAGE_INFO.INFO_TITULO.getMessage());
        Ufs ufs = valores.getRango();
        logger.debug(gson.toJson(ufs));

        ufs=iRangosFechasService.getUfsComplete(ufs);

        logger.info(IRangosFechasService.MESSAGE_INFO.INFO_PROCEDIMIENTO.getMessage());
        logger.info(IRangosFechasService.MESSAGE_INFO.INFO_OBSERVA.getMessage());
        logger.debug(gson.toJson(ufs));
    }
}
