package com.pgroomapp.repository;

import com.pgroomapp.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoomRepository extends MongoRepository<Room,Integer> {

    List<Room> findByRoomSharingType(Integer sharingType);

    @Query("{rentPerPerson:{$lte:?0}}")
    List<Room> findByRentPerPerson(double rentPerPerson);

    List<Room> findByWifi(Boolean wifi);

    List<Room> findByBalcony(Boolean balcony);

    @Query("{wallColor:?0}")
    List<Room> findByWallColor(String wallColor);

    List<Room> findByRoomCleaningService(Boolean roomCleaningService);

    @Query("{$and:[{balcony:?0},{wifi:?1}]}")
    List<Room> findByBalconyAndWifi(Boolean balcony, Boolean wifi);



}
