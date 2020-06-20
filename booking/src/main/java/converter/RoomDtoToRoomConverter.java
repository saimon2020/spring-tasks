package converter;

import dto.RoomDto;
import entity.Room;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RoomDtoToRoomConverter implements Converter<RoomDto, Room> {
    @Override
    public Room convert(RoomDto roomDto) {
        Room room = new Room();
        room.setNumber(roomDto.getNumber());
        room.setType(roomDto.getType().toString());
        return room;
    }
}
