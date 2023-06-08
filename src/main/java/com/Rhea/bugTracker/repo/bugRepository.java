package com.Rhea.bugTracker.repo;

import com.Rhea.bugTracker.model.bug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bugRepository extends JpaRepository<bug, Long> {

}
