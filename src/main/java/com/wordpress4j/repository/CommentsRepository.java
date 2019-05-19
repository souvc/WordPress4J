package com.wordpress4j.repository;

import com.wordpress4j.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author souvc
 */
public interface CommentsRepository extends JpaRepository<Comments,Long> {
}
