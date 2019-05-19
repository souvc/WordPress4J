package com.wordpress4j.repository;

import com.wordpress4j.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author souvc
 */
public interface PostsRepository extends JpaRepository<Posts,Long> {
}
