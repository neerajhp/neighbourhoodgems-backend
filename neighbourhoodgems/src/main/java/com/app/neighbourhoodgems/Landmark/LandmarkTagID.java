package com.app.neighbourhoodgems.Landmark;

import java.io.Serializable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Simple object representing a landmark tag entity
 *
 * @author Neeraj Patel
 */
@Table(name = "landmarkTags")
public class LandmarkTagID implements Serializable {

  @ManyToOne
  @JoinColumn(name = "landmarkID")
  Landmark landmark;

  @ManyToOne
  @JoinColumn(name = "tag")
  Tag tag;
}
