package com.app.neighbourhoodgems.Landmark;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Simple object representing a landmark type entity
 *
 * @author Neeraj Patel
 */
@Entity
@Table(name = "types")
public class Type {

  @Column(name = "id")
  private int id;

  @Column(name = "name")
  private String name;
}
