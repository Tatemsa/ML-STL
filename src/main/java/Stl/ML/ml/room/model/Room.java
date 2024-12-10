package Stl.ML.ml.room.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ROOM")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RM_ID")
	private Integer id;

	@Column(name = "RM_NUMBER", unique = true, nullable = false, length = 10)
	private String number;

	@Column(name = "RM_PRICE", nullable = false)
	private Double price;

	@Enumerated(EnumType.STRING)
	@Column(name = "RM_STANDING")
	private Standing standing;

	@Enumerated(EnumType.STRING)
	@Column(name = "RM_STATUS", nullable = false)
	private Status status;

	@Column(name = "RM_IMAGE", nullable = false, length = 255)
	private String image;

	public enum Standing {
		simple, stadard, hight
	}

	public enum Status {
		booked, pending
	}

	public Room() {

	}

	public Room(String number, Double price, Standing standing, Status status, String image) {
		this.number = number;
		this.price = price;
		this.standing = standing;
		this.status = status;
		this.image = image;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Standing getStanding() {
		return standing;
	}
	public void setStanding(Standing standing) {
		this.standing = standing;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Room{" +
			"id=" + id +
			", number='" + number + '\'' +
			", price=" + price +
			", standing=" + standing +
			", status=" + status +
			", image='" + image + '\'' +
			'}';
	}
}
