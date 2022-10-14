package com.polysocial.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.polysocial.dto.GroupDTO;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@Entity
@Table(name = "Group")
public class Group implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupid")
    private Long groupId;

    @Column(name = "name")
    private String name;

    @Column(name = "totalmember")
    private Long totalMember;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "createddate")
    private Date createdDate;

    // public Group(GroupDTO dto) {
    //     if (dto != null) {
    //         this.groupId = dto.getGroupId();
    //         this.name = dto.getName();
    //         this.totalMember = dto.getTotalMember();
    //         this.description = dto.getDescription();
    //         this.status = dto.getStatus();
    //         this.createdDate = dto.getCreatedDate();
    //     }
    // }
}
