package com.lak.boot.hotelbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RoomRestController {

    private RoomService roomService;

    @Autowired
    public RoomRestController(RoomService roomService){
        super();
        this.roomService = roomService;
    }

    @GetMapping("/rooms")
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }

   @PostMapping
    public void addRoom(@RequestBody Room room){
        roomService.addRoom(room);
    }

    @GetMapping(path="{id}")
    public Optional<Room> getRoomById(@PathVariable("id") Long roomId){
        return roomService.getRoomById(roomId);
    }

    @DeleteMapping(path="{id}")
    public void deleteById(@PathVariable("id") Long roomId){
         roomService.deleteRoomById(roomId);
    }

    @PutMapping(path="{id}")
    public void updateRoomInfo(@RequestBody Room room, @PathVariable("id") Long roomId){
        roomService.updateRoomInfo(room);
    }
}
