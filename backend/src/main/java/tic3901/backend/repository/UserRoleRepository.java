package tic3901.backend.repository;

import org.springframework.stereotype.Repository;

import tic3901.backend.model.UserRole;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRoleRepository extends JpaRepository <UserRole, Integer> {

}
