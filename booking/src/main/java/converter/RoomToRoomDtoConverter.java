package converter;

import dto.RoomDto;
import entity.Room;
import enums.RoomType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RoomToRoomDtoConverter implements Converter<Room, RoomDto>{
    @Override
    public RoomDto convert(Room room) {
        RoomDto target = new RoomDto();
        target.setNumber(room.getNumber());
        target.setType(RoomType.valueOf(room.getType()));
        return target;
    }
}
