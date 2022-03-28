package com.pgroomapp.repository;

import com.pgroomapp.model.PGBranch;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBranchRepository extends MongoRepository<PGBranch,Integer> {
}
