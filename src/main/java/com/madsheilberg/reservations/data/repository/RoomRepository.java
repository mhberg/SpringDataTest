package com.madsheilberg.reservations.data.repository;

import com.madsheilberg.reservations.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, String> {
    //Builds SELECT * FROM ROOM WHERE ROOM_NUMBER = ?VALUE?
    Room findByNumber(String number);
}
