package com.wordpress4j.repository;

import com.wordpress4j.entity.Terms;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author souvc
 */
public interface TermsRepository extends JpaRepository<Terms,Long> {
}
