package com.iedaas.checklistspace.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_uid")
    @Type(type= "org.hibernate.type.UUIDCharType")
    private UUID userUid;

    @Column(name = "full_name")
    private String userName;

    @Column(name = "image_url")
    private String userImage;

    @Column(name = "role")
    private String role;

    @ManyToMany(mappedBy = "spaceUsers")
    Set<Space> userSpaces;

    public int getUserId() {
        return userId;
    }

    public UUID getUserUid() {
        return userUid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
