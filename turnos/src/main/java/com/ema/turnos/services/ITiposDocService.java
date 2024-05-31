package com.ema.turnos.services;



import com.ema.turnos.entities.TiposDoc;

import java.util.List;

public interface ITiposDocService {
    List<TiposDoc   > getAll();
    List<TiposDoc> findByDescrip(String descrip);
    TiposDoc get(Integer id);
    void save(TiposDoc entity);
    String delete(TiposDoc entity);
}
