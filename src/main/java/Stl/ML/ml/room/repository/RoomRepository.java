package Stl.ML.ml.room.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Stl.ML.ml.room.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

	@Query("select r from Room r where r.number = :number")
	Room findByRoomNumber(@Param("number") String number);

}
