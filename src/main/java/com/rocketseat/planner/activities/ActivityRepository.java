package com.rocketseat.planner.activities;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocketseat.planner.participant.Participant;


public interface ActivityRepository extends JpaRepository<Activity, UUID> {
  List<Activity> findByTripId(UUID tripId);
}
