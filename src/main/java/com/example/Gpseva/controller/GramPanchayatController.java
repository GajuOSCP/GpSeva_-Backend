package com.example.Gpseva.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Gpseva.entity.GramPanchayat;
import com.example.Gpseva.service.GramPanchayatService;

@RestController
@RequestMapping("/api/register")
@CrossOrigin(origins = "http://localhost:3000")
public class GramPanchayatController {

    private final GramPanchayatService service;

    public GramPanchayatController(GramPanchayatService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<?> register(@RequestBody GramPanchayat gp) {
        System.out.println("API HIT 🔥");
        System.out.println(gp);

        GramPanchayat saved = service.save(gp);
        return ResponseEntity.ok(saved);
    }

}
