package com.termos.scooterrental.controller;

import com.termos.scooterrental.api.BasicResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("rental")
public class RentalController {
    @GetMapping(value = "/{scooterId}/scooters", produces = "application/json")
    public ResponseEntity<BasicResponse> rechargeUserAccount(
            @PathVariable Long scooterId,
            @RequestParam Long accountId)
    {
        return null;
    }
}
