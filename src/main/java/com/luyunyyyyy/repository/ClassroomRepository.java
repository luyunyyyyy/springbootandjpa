package com.luyunyyyyy.repository;

import com.luyunyyyyy.domain.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

/**
 * Created by LYY on 2017/5/1.
 */
public interface ClassroomRepository extends JpaRepository<Classroom,Long>{
    @RestResource(path="buildAndFloor",rel="buildAndFloor")
    Collection<Classroom> findByBuildingNumberAndFloorNumber(@Param("buildingNumber") int buildingNumber,@Param("floorNumber") int floorNumber);
}
