package com.wordpress4j.repository;

import com.wordpress4j.entity.TermTaxonomy;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author souvc
 */
public interface TermTaxonomyRepository extends JpaRepository<TermTaxonomy,Long> {
}
