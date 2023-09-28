package tic3901.backend.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role")
    private String role;
    
    public UserRole() {
    }

    public UserRole(String role) {
        this.role = role;
    }

    public void setId(Integer id) { this.id = id; }
    public Integer getId() { return id; }
    public void setRole(String role) {this.role = role; }
    public String getRole() { return role; }

    

}
