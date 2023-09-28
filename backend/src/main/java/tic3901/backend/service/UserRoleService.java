package tic3901.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tic3901.backend.model.UserRole;

import tic3901.backend.repository.UserRoleRepository;

@Service
public class UserRoleService {
    @Autowired
    private UserRoleRepository userRoleRepo;

    public List <UserRole> getAllUserRoles() {
        return userRoleRepo.findAll();
    }

    public UserRole getUserRoleById(int id) {
        return userRoleRepo.findById(id).orElse(null);
    }

    public void saveUserRole(UserRole userRole) {
        userRoleRepo.save(userRole);
    }

    public void deleteUserRoleById(int id) {
        userRoleRepo.deleteById(id);
    }

    public void deleteUserRole(UserRole userRole) {
        userRoleRepo.delete(userRole);
    }
}
