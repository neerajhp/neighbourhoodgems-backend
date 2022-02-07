package com.app.neighbourhoodgems.Landmark;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Simple object representing a landmark type entity
 *
 * @author Neeraj Patel
 */
@Entity
@Table(name = "types")
public class Type {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name")
  private String name;
}
