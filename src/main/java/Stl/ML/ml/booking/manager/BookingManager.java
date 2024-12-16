package Stl.ML.ml.booking.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Stl.ML.ml.booking.model.Booking;
import Stl.ML.ml.booking.repository.BookingRepository;
import Stl.ML.ml.client.model.Client;

@Service
@RestController	
@RequestMapping(path = "booking")
public class BookingManager {

	@Autowired
	private BookingRepository bookingRepository;

	@GetMapping(path = "")
	public List<Booking> getAll() {
		return bookingRepository.findAll();
	}

	@GetMapping(path = "/{id}")
	public Optional<Booking> getBookingById(@PathVariable int id) {
		return bookingRepository.findById(id);
	}

	@GetMapping(path = "/book/{id}")
	public Client getClientByBooking(@PathVariable int id) {
		return bookingRepository.findById(id).get().getClient();
	}

	@PostMapping(path = "/add")
	public Booking add(Booking booking) {
		return bookingRepository.save(booking);
	}

	@PostMapping(path = "/update")
	public Booking update(Booking booking) {
		return bookingRepository.save(booking);
	}
}
