package service;

import dto.RoomDto;
import entity.Room;
import exception.RoomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.RoomRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;
    private final ConversionService conversionService;
    private final String value;

    @Autowired
    public RoomServiceImpl(RoomRepository roomRepository, ConversionService conversionService, @Value("test.field") String value) {
        this.roomRepository = roomRepository;
        this.conversionService = conversionService;
        this.value = value;
    }

    @Override
    public RoomDto getRoomByNumber(int number) {
        Room room = roomRepository.findById(number).orElseThrow(() -> new RoomException("Room is not found"));
        return conversionService.convert(room, RoomDto.class);
    }

    @Override
    public List<RoomDto> getAll() {
        List<Room> rooms = roomRepository.findAll();
        return rooms.stream().map(room -> conversionService.convert(room, RoomDto.class)).collect(Collectors.toList());
    }

    @Override
    public RoomDto createRoom(RoomDto roomDto) {
        Room room = conversionService.convert(roomDto, Room.class);
        return conversionService.convert(roomRepository.save(room), RoomDto.class);
    }

    @Override
    public RoomDto updateRoom(RoomDto roomDto) {
        Room room = roomRepository.findById(roomDto.getNumber()).orElseThrow(() -> new RoomException("Room is not found"));
        room.setNumber(roomDto.getNumber());
        room.setType(roomDto.getType().toString());
        return conversionService.convert(roomRepository.save(room), RoomDto.class);
    }

    @Override
    public void deleteRoom(int number) {
        Room room = roomRepository.findById(number).orElseThrow(() -> new RoomException("Room is not found"));
        roomRepository.delete(room);
    }
}
