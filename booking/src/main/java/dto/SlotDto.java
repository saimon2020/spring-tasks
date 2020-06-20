package dto;

import java.time.LocalDate;

public class SlotDto {
    private RoomDto room;
    private LocalDate date;

    public RoomDto getRoom() {
        return room;
    }

    public void setRoom(RoomDto room) {
        this.room = room;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
