package com.luyunyyyyy.service;

import com.luyunyyyyy.domain.Desk;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lyy on 2017/4/27.
 */
public interface DeskRepository extends JpaRepository<Desk,Long> {
}
