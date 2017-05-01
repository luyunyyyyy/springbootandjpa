package com.luyunyyyyy.service;

import com.luyunyyyyy.domain.Reservationrecord;
import com.luyunyyyyy.domain.Violationsrecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

/**
 * Created by lyy on 2017/4/27.
 */
public interface ViolationsrecordRepository extends JpaRepository<Violationsrecord,Long> {

    @RestResource(path="violationsUserId",rel="violationsUserId")
    public Collection<Violationsrecord> findByViolationsUserId(@Param("violationsUserId") Long id);
}
