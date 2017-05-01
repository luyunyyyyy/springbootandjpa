package com.luyunyyyyy.service;

import com.luyunyyyyy.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lyy on 2017/4/27.
 */
public interface NoticeRepository extends JpaRepository<Notice ,Long> {
}
