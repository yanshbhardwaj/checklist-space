package com.iedaas.checklistspace.dao;

import com.iedaas.checklistspace.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
