package controller;

import dto.RoomDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.RoomService;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping
    public RoomDto createRoom(@RequestBody RoomDto personDto) {
        return roomService.createRoom(personDto);
    }

    @PutMapping
    public RoomDto updatePerson(@RequestBody RoomDto personDto) {
        return roomService.updateRoom(personDto);
    }

    @DeleteMapping
    public void deletePerson(@PathParam("number") Integer number) {
        roomService.deleteRoom(number);
    }
}
