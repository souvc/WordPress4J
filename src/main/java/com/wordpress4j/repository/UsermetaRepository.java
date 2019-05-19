package com.wordpress4j.repository;

import com.wordpress4j.entity.Usermeta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author souvc
 */
public interface UsermetaRepository extends JpaRepository<Usermeta,Long> {
}
