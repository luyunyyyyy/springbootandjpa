package com.luyunyyyyy.service;

import com.luyunyyyyy.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by LYY on 2017/4/27.
 */

public interface AdminRepository extends JpaRepository<Admin, Long>{


}
