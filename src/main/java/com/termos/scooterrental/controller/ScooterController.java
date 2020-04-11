package com.termos.scooterrental.controller;
import com.termos.scooterrental.api.response.AddScooterResponse;
import com.termos.scooterrental.api.request.AddScooterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("scooter")
public class ScooterController {
             @GetMapping(value = "/add", produces = "application/json")
        public ResponseEntity<AddScooterResponse> addScooter(
                @RequestBody AddScooterRequest request
        )
        {
            return null;
        }
}
