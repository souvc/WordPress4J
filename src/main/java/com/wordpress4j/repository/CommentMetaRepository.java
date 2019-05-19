package com.wordpress4j.repository;

import com.wordpress4j.entity.Commentmeta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author souvc
 */
public interface CommentMetaRepository extends JpaRepository<Commentmeta,Long> {
}
