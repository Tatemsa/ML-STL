package Stl.ML.ml.client.model;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CL_ID")
	private int id;

	@Column(name = "CL_NAME")
	private String name;

	@Column(name = "CL_SECOND_NAME ")
	private String secondName;

	@Column(name = "CL_BIRTHDAY")
	private LocalDateTime birthday;

	@Column(name = "CL_NATIONNALITE")
	private String nationnality;

	@Column(name = "CL_COUNTRY_STAY")
	private String country;

	@Column(name = "CL_ADDRESSE")
	private String address;

	@Column(name = "CL_PROFESSION")
	private String profession;

	@Column(name = "CL_PROVENANCE")
	private String provenance;

	@Column(name = "CL_DESTINATION")
	private String destination;

	@Column(name = "CL_PARENT_NAME")
	private String parentName;

	@Column(name = "CL_IDENTITY_PIECE")
	private String identityPiece;

	@Column(name = "CL_DELIVRANCE_DATE")
	private LocalDateTime delivrance;

	@Column(name = "CL_TRANSPORT_MODE")
	private String transportMode;

	@Column(name = "CL_IMMATRICULATION")
	private String immatriculation;

	@Column(name = "Cl_EMAIL")
	private String email;

	@Column(name = "CL_CONTACT")
	private String contact;

	@Column(name = "CL_PASSWORD")
	private String password;

	public Client() {

	}

	public Client(String name, String secondName, LocalDateTime birthday, String nationnality, String country, String addresse, String profession,
		String provenance,
		String destination, String parentName, String identityPiece, LocalDateTime delivrance, String transportMode, String immatriculation, String email,
		String contact, String password) {
		this.name = name;
		this.secondName = secondName;
		this.birthday = birthday;
		this.nationnality = nationnality;
		this.country = country;
		this.address = addresse;
		this.profession = profession;
		this.provenance = provenance;
		this.destination = destination;
		this.parentName = parentName;
		this.identityPiece = identityPiece;
		this.delivrance = delivrance;
		this.transportMode = transportMode;
		this.immatriculation = immatriculation;
		this.email = email;
		this.contact = contact;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public LocalDateTime getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}
	public String getNationnality() {
		return nationnality;
	}
	public void setNationnality(String nationnality) {
		this.nationnality = nationnality;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getProvenance() {
		return provenance;
	}
	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getIdentityPiece() {
		return identityPiece;
	}
	public void setIdentityPiece(String identityPiece) {
		this.identityPiece = identityPiece;
	}
	public LocalDateTime getDelivrance() {
		return delivrance;
	}
	public void setDelivrance(LocalDateTime delivrance) {
		this.delivrance = delivrance;
	}
	public String getTransportMode() {
		return transportMode;
	}
	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", name='" + name + '\'' +
			", secondName='" + secondName + '\'' +
			", birthday=" + birthday +
			", nationnality='" + nationnality + '\'' +
			", country='" + country + '\'' +
			", addresse='" + address + '\'' +
			", profession='" + profession + '\'' +
			", provenance='" + provenance + '\'' +
			", destination='" + destination + '\'' +
			", parentName='" + parentName + '\'' +
			", identityPiece='" + identityPiece + '\'' +
			", delivrance=" + delivrance +
			", transportMode='" + transportMode + '\'' +
			", immatriculation='" + immatriculation + '\'' +
			", email='" + email + '\'' +
			", contact='" + contact + '\'' +
			", password='" + password + '\'' +
			'}';
	}
}