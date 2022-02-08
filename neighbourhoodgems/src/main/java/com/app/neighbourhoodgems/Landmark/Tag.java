package com.app.neighbourhoodgems.Landmark;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Simple object representing a tag entity
 *
 * @author Neeraj Patel
 */
@Entity
@Table(name = "tags")
public class Tag {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name")
  private String name;

  @ManyToMany(mappedBy = "tags", targetEntity = Landmark.class)
  private Set<Landmark> posts = new HashSet<>();

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Landmark> getPosts() {
    return this.posts;
  }
}
