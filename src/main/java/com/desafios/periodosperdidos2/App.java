package com.desafios.periodosperdidos2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.previred.desafio.tres.uf.DatosUf;
import com.previred.desafio.tres.uf.Valores;
import com.previred.desafio.tres.uf.vo.Uf;
import com.previred.desafio.tres.uf.vo.Ufs;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Valores valores = new Valores();
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

        System.out.println("Consumir la función getRango de la clase com.previred.desafio.tres.uf.Valores:\n");
        Ufs ufs = valores.getRango();
        System.out.println(gson.toJson(ufs) + "\n");

        Set<Uf> ufList = DatosUf.getInstance().getUfs(ufs.getInicio(), ufs.getFin()).stream()
                .sorted(Comparator.comparing(Uf::getFecha))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        ufs.setUfs(ufList);

        System.out.println("Escribir un algoritmo para complementar los valores de UF para las fechas faltantes en la " +
                "lista contenidas en la clase Ufs que retorna getRango");
        System.out.println("Para complementar los valores de UF se pueden utilizar los métodos getUf y getUfs de la " +
                "clase com.previred.desafio.tres.uf.DatosUf.\n");
        System.out.println(gson.toJson(ufs));
    }
}
