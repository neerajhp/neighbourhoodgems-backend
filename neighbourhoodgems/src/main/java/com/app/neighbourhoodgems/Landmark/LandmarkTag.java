package com.app.neighbourhoodgems.Landmark;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Simple object representing a landmark tag entity
 *
 * @author Neeraj Patel
 */
@Entity
@Table(name = "landmarkTags")
public class LandmarkTag {

  @ManyToOne
  @JoinColumn(name = "landmarkID")
  Landmark landmark;

  @ManyToOne
  @JoinColumn(name = "tag")
  Tag tag;
}
