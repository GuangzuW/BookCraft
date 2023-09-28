package tic3901.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tic3901.backend.model.UserAccount;
import tic3901.backend.repository.UserAccountRepository;

@Service
public class UserAccountService {
    
    @Autowired
    private UserAccountRepository userAccountRepo;


    public void deleteUserAccountById(int id) {
        userAccountRepo.deleteById(id);
    }

    public List<UserAccount> getAllUserAccounts() {
        return userAccountRepo.findAll();
    }

    public UserAccount getUserAccountById(int id) {
        return userAccountRepo.findById(id).orElse(null);
    }

    public void saveUserAccount(UserAccount userAccount) {
        userAccountRepo.save(userAccount);
    }

    public UserAccount findByEmail(String email) {
        return userAccountRepo.findByEmail(email);
    }

    
}
