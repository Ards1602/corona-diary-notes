package com.ards.heru.service;

import com.ards.heru.entity.CoronaVirus;

import java.util.List;

public interface CoronaVirusService {

    CoronaVirus save(CoronaVirus coronaVirus);
    List<CoronaVirus> getAllConfirmed();
    List<CoronaVirus> getAllConfirmedByDateAscending();
    List<CoronaVirus> getAllConfirmedByDateDescending();
    List<CoronaVirus> getAllByProvinceOrderByCityAscending(String prov);
    List<CoronaVirus> getAllByProvinceOrderByCityDescending(String prov);

}
