package com.polysocial.service.impl;

import com.polysocial.dto.GroupDTO;
import com.polysocial.entity.Group;
import com.polysocial.repository.GroupRepository;
import com.polysocial.service.GroupService;
import com.polysocial.utils.Logger;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public List<GroupDTO> getGroup() {
       
        try {
            // List<GroupDTO> result = new ArrayList<GroupDTO>();
            // List<Group> result = groupRepository.findAll();
            // System.out.println("==>>>>>"+result);
            // List<Group> findAllGroup= groupRepository.findAll();
            
            // for(Group group : findAllGroup){
            //     System.out.println("two 3");
            //     GroupDTO dto = new GroupDTO(group);
            //     result.add(dto);
            // }
            return null;
        }catch (Exception ex){
            System.out.println("==> "+ex);
            return null;
        }
    }
}
