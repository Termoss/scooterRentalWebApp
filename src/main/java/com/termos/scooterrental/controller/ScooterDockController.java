package com.termos.scooterrental.controller;

import com.termos.scooterrental.model.Scooter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("scooter-dock")
public class ScooterDockController {
    @GetMapping(value = "/{scooterDockId}/scooters", produces = "application/json")
    public ResponseEntity<Set<Scooter>> rechargeUserAccount(
            @PathVariable Long scooterDockId
    )
    {
        return null;
    }
}
