package com.luyunyyyyy.service;

import com.luyunyyyyy.domain.Reservationrecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

/**
 * Created by lyy on 2017/4/27.
 */
public interface ReservationrecordRepository extends JpaRepository<Reservationrecord,Long> {

    @RestResource(path="recordUserId",rel="recordUserId")
    public Collection<Reservationrecord> findByRecordUserId(@Param("recordUserId") Long id);
}
