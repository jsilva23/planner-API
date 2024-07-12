package com.rocketseat.planner.link;

import java.util.UUID;

import com.rocketseat.planner.trip.Trip;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "links")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Link {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false)
  private String url;

  @ManyToOne
  @JoinColumn(name = "trip_id", nullable = false)
  private Trip trip;

  public Link(String title, String url, Trip trip) {
    this.title = title;
    this.url = url;
    this.trip = trip;
  }
}
