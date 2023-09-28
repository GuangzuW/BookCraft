package tic3901.backend.repository;

import org.springframework.stereotype.Repository;

import tic3901.backend.model.UserAccount;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface UserAccountRepository extends JpaRepository <UserAccount, Integer>{

    UserAccount findByEmail(String email);

}
