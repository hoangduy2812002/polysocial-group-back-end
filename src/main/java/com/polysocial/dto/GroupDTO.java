package com.polysocial.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.polysocial.entity.Group;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupDTO implements Serializable {

    private Long groupId;

    private String name;

    private Long totalMember;

    private String description;

    private Boolean status; 

    private Date createdDate;

    // public GroupDTO(Group group) {
    //     if (group != null) {
    //         this.groupId = group.getGroupId();
    //         this.name = group.getName();
    //         this.totalMember = group.getTotalMember();
    //         this.description = group.getDescription();
    //         this.status = group.getStatus();
    //         this.createdDate = group.getCreatedDate();
    //     }
    // }
}
