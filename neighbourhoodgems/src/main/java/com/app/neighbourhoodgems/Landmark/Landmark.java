package com.app.neighbourhoodgems.Landmark;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Simple object representing a landmark entity
 *
 * @author Neeraj Patel
 */
@Entity
@Table(name = "landmarks")
public class Landmark {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name")
  private String name;

  @Column(name = "lat")
  private float lat;

  @Column(name = "lng")
  private float lng;

  @Column(name = "rating")
  private int rating;

  @Column(name = "description")
  private String description;

  @Column(name = "url")
  private String url;

  @OneToOne
  @JoinColumn(name = "type", referencedColumnName = "id")
  private Type type;

  // @OneToMany(mappedBy = "landmark")
  // Set<Tag> tags;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getLat() {
    return this.lat;
  }

  public void setLat(float lat) {
    this.lat = lat;
  }

  public float getLng() {
    return this.lng;
  }

  public void setLng(float lng) {
    this.lng = lng;
  }

  public int getRating() {
    return this.rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Type getType() {
    return this.type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  // public Set<Tag> getTags() {
  //   return this.tags;
  // }

  // public void setTags(Set<Tag> tags) {
  //   this.tags = tags;
  // }
}
