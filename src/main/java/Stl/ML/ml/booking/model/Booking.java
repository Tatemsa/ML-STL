package Stl.ML.ml.booking.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import Stl.ML.ml.client.model.Client;
import Stl.ML.ml.room.model.Room;

@Entity
@Table(name = "BOOKING")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BK_ID")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "BK_CL_ID", nullable = false)
	private Client client;

	@ManyToOne
	@JoinColumn(name = "BK_RM_ID")
	private Room room;

	@Column(name = "BK_START_DATE", nullable = false)
	private LocalDate startDate;

	@Column(name = "BK_END_DATE", nullable = false)
	private LocalDate endDate;

	@Enumerated(EnumType.STRING)
	@Column(name = "BK_STATUS", nullable = false, columnDefinition = "ENUM('confirmed', 'cancelled', 'pending')")
	private Status status = Status.pending;

	@Column(name = "BK_CHILD_NUMBER")
	private Integer childNumber;

	@Column(name = "BK_ADULT_NUMBER", nullable = false)
	private Integer adultNumber;

	public enum Status {
		confirmed, cancelled, pending
	}

	public Booking() {

	}

	public Booking(Client client, Room room, LocalDate startDate, LocalDate endDate, Status status, Integer childNumber, Integer adultNumber) {
		this.client = client;
		this.room = room;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.childNumber = childNumber;
		this.adultNumber = adultNumber;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Integer getChildNumber() {
		return childNumber;
	}
	public void setChildNumber(Integer childNumber) {
		this.childNumber = childNumber;
	}
	public Integer getAdultNumber() {
		return adultNumber;
	}
	public void setAdultNumber(Integer adultNumber) {
		this.adultNumber = adultNumber;
	}

	@Override
	public String toString() {
		return "Booking{" +
			"id=" + id +
			", client=" + client +
			", room=" + room +
			", startDate=" + startDate +
			", endDate=" + endDate +
			", status=" + status +
			", childNumber=" + childNumber +
			", adultNumber=" + adultNumber +
			'}';
	}
}
