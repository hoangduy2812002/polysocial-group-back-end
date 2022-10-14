package com.polysocial.rest.controller;

import com.polysocial.consts.GroupAPI;
import com.polysocial.dto.GroupDTO;
import com.polysocial.repository.GroupRepository;
import com.polysocial.service.GroupService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {

    @Autowired
    GroupService groupService;

    @Autowired
    GroupRepository groupRepository;

    // @GetMapping(GroupAPI.API_GET_POST)
    // public List<GroupDTO> getPost(){
    //  return groupService.getGroup();
    // }
    @GetMapping(GroupAPI.API_GET_POST)
    public String getPost(){
        System.out.println("==>"+groupRepository.findAll());
     return "";
    }
}
