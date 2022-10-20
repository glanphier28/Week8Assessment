/**
 * @author gabel - glanphier
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Car;

/**
 * @author gabel
 *
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

}
