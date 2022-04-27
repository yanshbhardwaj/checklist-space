package com.iedaas.checklistspace.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "space")
public class Space {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "space_id")
    private int spaceId;

    @Column(name = "space_uid")
    @Type(type= "org.hibernate.type.UUIDCharType")
    private UUID spaceUid=UUID.randomUUID();

    @Column(name = "space_name")
    private String spaceName;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "createdDate")
    private Timestamp createdDate;

    @Column(name = "is_private")
    private boolean isPrivate;

    @ManyToMany
    @JoinTable(
            name = "user_space",
            joinColumns = @JoinColumn(name = "space_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    Set<User> spaceUsers;

    public int getSpaceId() {
        return spaceId;
    }

    public UUID getSpaceUid() {
        return spaceUid;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    @Override
    public String toString() {
        return "Space{" +
                "spaceUid=" + spaceUid +
                ", spaceName='" + spaceName + '\'' +
                ", statusId='" + statusId + '\'' +
                ", createdDate=" + createdDate +
                ", isPrivate=" + isPrivate +
                '}';
    }
}
