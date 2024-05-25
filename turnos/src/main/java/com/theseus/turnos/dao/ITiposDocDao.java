package com.theseus.turnos.dao;



import com.theseus.turnos.entities.TiposDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITiposDocDao extends JpaRepository<TiposDoc, Integer> {
    @Query("select c from TiposDoc c where c.descrip like ?1")
    public List<TiposDoc> findByDescrip(String name);
}
