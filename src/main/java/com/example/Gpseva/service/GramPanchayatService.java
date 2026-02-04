package com.example.Gpseva.service;

import org.springframework.stereotype.Service;
import com.example.Gpseva.entity.GramPanchayat;
import com.example.Gpseva.repository.GramPanchayatRepository;

@Service
public class GramPanchayatService {

    private final GramPanchayatRepository repo;

    public GramPanchayatService(GramPanchayatRepository repo) {
        this.repo = repo;
    }

    public GramPanchayat save(GramPanchayat gp) {
        return repo.save(gp);
    }
}


