package com.app.neighbourhoodgems.Landmark;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Simple object representing a tag entity
 *
 * @author Neeraj Patel
 */
@Entity
@Table(name = "tags")
public class Tag {

  @Column(name = "id")
  private int id;

  @Column(name = "name")
  private String name;
}
