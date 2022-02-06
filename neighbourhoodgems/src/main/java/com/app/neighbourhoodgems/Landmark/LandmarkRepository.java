package com.app.neighbourhoodgems.Landmark;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repository class for Landmark objects
 *
 * @author Neeraj Patel
 */
@Repository
public interface LandmarkRepository extends JpaRepository<Landmark, Integer> {

  /**
   * Retrieve all {@link Landmark}s from database.
   *
   * @return a Collection of {@link Landmark}s
   */
  @Query("SELECT l FROM Landmark l")
  @Transactional(readOnly = true)
  public List<Landmark> findAll();

  /**
   * Retrieve a {@link Landmark} from database by id.
   *
   * @param id to search for
   * @return the {@link Landmark} if found
   */
  @Query("SELECT l from Landmark l WHERE l.id = :id")
  @Transactional(readOnly = true)
  public Landmark findById(@Param("id") Integer id);

  // Search Landmarks

  // Search Landmark

  // Add Landmark

}
