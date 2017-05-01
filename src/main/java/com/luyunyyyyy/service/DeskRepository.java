package com.luyunyyyyy.service;

import com.luyunyyyyy.domain.Desk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

/**
 * Created by lyy on 2017/4/27.
 */
public interface DeskRepository extends JpaRepository<Desk,Long> {

    @RestResource(path="deskLocationId",rel="deskLocationId")
    Collection<Desk> findByDeskLocationId(@Param("deskLocationId") Long id);
}
