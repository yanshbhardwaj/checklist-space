package com.iedaas.checklistspace.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_space")
public class UserSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_space_id")
    private int userSpaceId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "space_id")
    private int spaceId;

    @Column(name = "user_space_role")
    private String userSpaceRole;

    public int getUserSpaceId() {
        return userSpaceId;
    }

    public void setUserSpaceId(int userSpaceId) {
        this.userSpaceId = userSpaceId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(int spaceId) {
        this.spaceId = spaceId;
    }

    public String getUserSpaceRole() {
        return userSpaceRole;
    }

    public void setUserSpaceRole(String userSpaceRole) {
        this.userSpaceRole = userSpaceRole;
    }
}
