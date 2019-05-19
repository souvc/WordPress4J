package com.wordpress4j.repository;

import com.wordpress4j.entity.Options;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author souvc
 */
public interface OptionsRepository extends JpaRepository<Options,Long> {
}
