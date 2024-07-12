package com.rocketseat.planner.participant;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface ParticipantRepository extends JpaRepository<Participant, UUID> {

  List<Participant> findByTripId(UUID tripId);
  
}
