package com.rocketseat.planner.activities;

import java.time.LocalDateTime;
import java.util.UUID;

import com.rocketseat.planner.trip.Trip;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "activities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Activity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(nullable = false)
  private String title;

  @Column(name = "occurs_at", nullable = false)
  private LocalDateTime occursAt;

  @ManyToOne
  @JoinColumn(name = "trip_id", nullable = false)
  private Trip trip;

  
}
