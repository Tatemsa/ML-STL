package Stl.ML.ml.room.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Stl.ML.ml.room.model.Room;
import Stl.ML.ml.room.repository.RoomRepository;

@Service
@RestController
@RequestMapping(path = "room")
public class RoomManager {

	@Autowired
	private RoomRepository roomRepository;

	@GetMapping(path = "")
	public List<Room> getAll() {
		return roomRepository.findAll();
	}

	@GetMapping(path = "/{id}")
	public Optional<Room> getByID(@PathVariable int id) {
		return roomRepository.findById(id);
	}

	@GetMapping(path = "/{number}")
	public Room getByCode(@PathVariable String number) {
		return roomRepository.findByRoomNumber(number);
	}

}
