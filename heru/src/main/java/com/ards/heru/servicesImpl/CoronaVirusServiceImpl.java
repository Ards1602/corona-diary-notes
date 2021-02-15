package com.ards.heru.servicesImpl;

import com.ards.heru.entity.CoronaVirus;
import com.ards.heru.repositoriy.CoronaVirusRepository;
import com.ards.heru.service.CoronaVirusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class CoronaVirusServiceImpl implements CoronaVirusService {

    @Autowired
    CoronaVirusRepository repository;

    @Override
    public CoronaVirus save(CoronaVirus coronaVirus) {
        return repository.save(coronaVirus);
    }

    @Override
    public List<CoronaVirus> getAllConfirmed() {
        List<CoronaVirus> getData = new ArrayList<>();
        repository.getAll().stream().forEach(result -> {
            getData.add(result);
        });
        return getData;
    }

    @Override
    public List<CoronaVirus> getAllConfirmedByDateAscending() {
        List<CoronaVirus> getData = new ArrayList<>();
        repository.getAll().stream()
                .sorted(Comparator.comparing(CoronaVirus::getUpdated))
                .forEach(result -> {
                    getData.add(result);
                });
        return getData;
    }

    @Override
    public List<CoronaVirus> getAllConfirmedByDateDescending() {
        List<CoronaVirus> getData = new ArrayList<>();
        repository.getAll().stream()
                .sorted(Comparator.comparing(CoronaVirus::getUpdated).reversed())
                .forEach(result -> {
                    getData.add(result);
                });
        return getData;
    }

    @Override
    public List<CoronaVirus> getAllByProvinceOrderByCityAscending(String prov) {
        List<CoronaVirus> getData = new ArrayList<>();
        repository.queryData(prov.toLowerCase()).stream()
                .sorted(Comparator.comparing(CoronaVirus::getCity))
                .forEach(result ->{
                    getData.add(result);
                });
        return getData;
    }

    @Override
    public List<CoronaVirus> getAllByProvinceOrderByCityDescending(String prov) {
        List<CoronaVirus> getData = new ArrayList<>();
        repository.queryData(prov.toLowerCase()).stream()
                .sorted(Comparator.comparing(CoronaVirus::getCity).reversed())
                .forEach(result -> {
                    getData.add(result);
                });
        return getData;
    }
}
