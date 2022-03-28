package com.pgroomapp.service;

import com.pgroomapp.model.PGBranch;
import com.pgroomapp.repository.IBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PGRoomServiceImpl implements IPGRoomService {

    @Autowired
    private IBranchRepository branchRepository;

    public void setBranchRepository(IBranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }


    @Override
    public void addPGRoom(PGBranch pgBranch) {
        branchRepository.insert(pgBranch);
    }
}
