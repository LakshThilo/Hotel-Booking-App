package com.lak.boot.hotelbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/hotel")
public class RoomController {

    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService){
        super();
        this.roomService = roomService;
    }


    @GetMapping("/rooms")
    public String getAllRooms(Model model){
        model.addAttribute("rooms",roomService.getAllRooms());
        return "rooms";
    }
}
