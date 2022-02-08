package com.app.neighbourhoodgems.Landmark;

import javax.persistence.Column;
import javax.persistence.Entity;
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

  @Id private String id;

  @Column(name = "description")
  private String description;

  public String getId() {
    return this.id;
  }

  public String getDescription() {
    return this.description;
  }
}
