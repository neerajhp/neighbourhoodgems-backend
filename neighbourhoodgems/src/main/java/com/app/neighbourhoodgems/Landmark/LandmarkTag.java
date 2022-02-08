package com.app.neighbourhoodgems.Landmark;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Simple object representing a landmark tag entity
 *
 * @author Neeraj Patel
 */
@Entity
@Table(name = "landmarkTags")
public class LandmarkTag implements Serializable {

  @EmbeddedId private LandmarkTagID id;
}
