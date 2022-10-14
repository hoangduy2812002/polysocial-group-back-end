package com.polysocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polysocial.entity.Group;

public interface GroupRepository  extends JpaRepository<Group, Long>{
    
}
