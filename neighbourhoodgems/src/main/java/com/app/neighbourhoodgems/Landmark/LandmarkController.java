package com.app.neighbourhoodgems.Landmark;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for {@link Landmark} objects.
 *
 * @author Neeraj Patel
 */
@RestController
@RequestMapping("/api/landmarks")
public class LandmarkController {

  @Autowired private LandmarkService landmarkService;

  @GetMapping("/all")
  public List<Landmark> getAll() {
    return landmarkService.getAll();
  }
}
