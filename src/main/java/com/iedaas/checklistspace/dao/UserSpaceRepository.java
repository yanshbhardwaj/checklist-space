package com.iedaas.checklistspace.dao;

import com.iedaas.checklistspace.entity.UserSpace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSpaceRepository extends JpaRepository<UserSpace, Integer> {
}
