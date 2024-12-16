package Stl.ML.ml.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Stl.ML.ml.booking.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
