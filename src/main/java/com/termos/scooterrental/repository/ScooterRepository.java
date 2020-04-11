package com.termos.scooterrental.repository;

import com.termos.scooterrental.model.Scooter;
import com.termos.scooterrental.model.ScooterDock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScooterRepository  extends JpaRepository<Scooter, Long> {
}
