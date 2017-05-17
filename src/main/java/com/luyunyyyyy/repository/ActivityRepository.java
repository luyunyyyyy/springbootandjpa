package com.luyunyyyyy.repository;

import com.luyunyyyyy.domain.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

/**
 * Created by LYY on 2017/5/1.
 */
public interface ActivityRepository extends JpaRepository<Activity, Long> {
    @RestResource(path = "activityClassroomId", rel = "activityClassroomId")
    Collection<Activity> findByActivityClassroomId(@Param("activityClassroomId") Long id);
}
