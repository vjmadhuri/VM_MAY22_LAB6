package com.gl.vm.empmsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.vm.empmsystem.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}