package com.desafios.periodosperdidos2.services;

import com.previred.desafio.tres.uf.vo.Ufs;

/**
 * Interface para inyeccion de dependencias del servicio
 * @author Jesus Alcala
 * @version 1.0.0
 */
public interface IRangosFechasService {
    enum MESSAGE_INFO{
        INFO_TITULO("Consumir la función getRango de la clase com.previred.desafio.tres.uf.Valores"),
        INFO_PROCEDIMIENTO("Escribir un algoritmo para complementar los valores de UF para las fechas faltantes en la " +
                "lista contenidas en la clase Ufs que retorna getRango"),
        INFO_OBSERVA("Para complementar los valores de UF se pueden utilizar los métodos getUf y getUfs de la " +
                "clase com.previred.desafio.tres.uf.DatosUf.");

        private final String message;

        MESSAGE_INFO(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    Ufs getUfsComplete(Ufs ufs);
}
