package com.iedaas.checklistspace.dao;

import com.iedaas.checklistspace.entity.Space;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpaceRepository extends JpaRepository<Space, Integer> {
}
