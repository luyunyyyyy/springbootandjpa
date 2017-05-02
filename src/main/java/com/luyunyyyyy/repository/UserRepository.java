package com.luyunyyyyy.repository;

import com.luyunyyyyy.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lyy on 2017/4/27.
 */
public interface UserRepository extends JpaRepository<User,Long> {


    User findByUserSutId(Long userSutId);
}
