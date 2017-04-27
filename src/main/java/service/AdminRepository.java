package service;

import domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by LYY on 2017/4/27.
 */
public interface AdminRepository extends JpaRepository<Admin, Long>{
}
