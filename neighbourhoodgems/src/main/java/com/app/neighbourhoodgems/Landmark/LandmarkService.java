package com.app.neighbourhoodgems.Landmark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class for {@link Landmark} objects.
 *
 * @author Neeraj Patel
 */
@Service
public class LandmarkService {

  @Autowired private LandmarkRepository landmarkRepository;
}
