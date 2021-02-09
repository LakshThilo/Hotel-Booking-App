package com.lak.boot.hotelbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    private RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository){
        super();
        this.roomRepository = roomRepository;

    }

    public List<Room> getAllRooms(){
        List<Room> rooms = new ArrayList<>();
        this.roomRepository.findAll().forEach(rooms::add);
        System.out.println(rooms);
        return rooms;
    }

    public void addRoom(Room room){
        roomRepository.save(room);
    }

    public Optional<Room> getRoomById(Long id){
        return roomRepository.findById(id);
    }

    public void deleteRoomById(Long roomId){
        roomRepository.deleteById(roomId);
    }

    public void updateRoomInfo(Room room) {
        roomRepository.save(room);
    }
}
