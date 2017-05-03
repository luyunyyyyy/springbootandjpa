package com.luyunyyyyy.service;

import com.luyunyyyyy.domain.ReservationRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

/**
 * Created by lyy on 2017/4/27.
 */
public interface ReservationRecordRepository extends JpaRepository<ReservationRecord,Long> {

    @RestResource(path="recordUserId",rel="recordUserId")
    Collection<ReservationRecord> findByRecordUserId(@Param("recordUserId") Long id);

    ReservationRecord findByRecordUserIdAndRecordState(Long id, String recordState);

}
