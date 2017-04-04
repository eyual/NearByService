package com.nearby.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nearby.app.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
}
