package tic3901.backend.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "user_account")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long user_id;

    @Email(message = "Please provide a valid email address")
    @NotBlank(message = "Email is required")
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;

    @Column(name = "role_id")
    private Integer role_id;

    public UserAccount() {
    }

    public UserAccount(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UserAccount(String email, String password, Integer role_id) {
        this.email = email;
        this.password = password;
        this.role_id = role_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        // Use BCrypt to hash the password before storing it
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.password = passwordEncoder.encode(password);
    }

    public String getPassword() {
        return password;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getRole_id() {
        return role_id;
    }
    
}
