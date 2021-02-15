package com.ards.heru.repositoriy;

import com.ards.heru.entity.CoronaVirus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoronaVirusRepository extends JpaRepository<CoronaVirus, String> {

    @Query(value = "select * from corona_virus", nativeQuery = true)
    List<CoronaVirus> queryData(String search);

    @Query(value = "select * from corona_virus", nativeQuery = true)
    List<CoronaVirus> getAll();

    @Query(value = "select max(confirmed) from corona_virus", nativeQuery = true)
    void getMaxConfirmed();

}
