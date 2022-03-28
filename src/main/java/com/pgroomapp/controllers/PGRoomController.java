package com.pgroomapp.controllers;

import com.pgroomapp.model.PGBranch;
import com.pgroomapp.repository.IBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pgroom-api")
public class PGRoomController {
    @Autowired
    private IBranchRepository branchRepository;

    @PostMapping("/pgroom")
    void addPgRoom(PGBranch pgBranch){
        branchRepository.insert(pgBranch);
    }



}
