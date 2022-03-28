package com.pgroomapp.repository;

import com.pgroomapp.model.RoomMember;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomMateRepository extends MongoRepository<RoomMember,Integer> {
}
