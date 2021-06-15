package com.desafios.periodosperdidos2.services;

import com.previred.desafio.tres.uf.DatosUf;
import com.previred.desafio.tres.uf.vo.Uf;
import com.previred.desafio.tres.uf.vo.Ufs;

import java.util.*;
import java.util.stream.Collectors;


public class RancoFechaService implements IRangosFechasService{
    @Override
    public Ufs getUfsComplete(Ufs ufs){
        List<Uf> ufList = new ArrayList<>();
        DatosUf.getInstance().getUfs(ufs.getInicio(), ufs.getFin()).stream()
                .sorted(Comparator.comparing(Uf::getFecha).reversed())
                .forEach(fn -> {
                    Optional<Uf> opUf = ufs.getUfs().stream()
                            .filter(fuf -> fuf.getFecha().equals(fn.getFecha()))
                            .findFirst();
                    opUf.ifPresent(uf -> fn.setValor(uf.getValor()));
                    ufList.add(fn);
                });
        ufs.setUfs(ufList.stream()
                .sorted(Comparator.comparing(Uf::getFecha))
                .collect(Collectors.toCollection(LinkedHashSet::new))
        );
        return ufs;
    }
}
