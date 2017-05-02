package com.luyunyyyyy.repository;

import com.luyunyyyyy.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

/**
 * Created by lyy on 2017/4/27.
 */
public interface LocationRepository extends JpaRepository<Location,Long> {
    @RestResource(path="locationFloor",rel="locationFloor")
    Collection<Location> findByLocationFloor(@Param("locationFloor") Long locationFloor);

    @RestResource(path="locationPart",rel="locationPart")
    Collection<Location> findByLocationPart(@Param("locationPart") Long locationFloor);
}
