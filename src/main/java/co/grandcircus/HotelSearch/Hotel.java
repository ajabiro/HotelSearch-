package co.grandcircus.HotelSearch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String hotel_name;
	private String city;
	private Integer price_per_night;

	
	//no args constructor
	public Hotel() {
	}
	
	//constructor with 4 attributes
	public Hotel(Long id, String hotel_name, String city, Integer price_per_night) {
		super();
		this.id = id;
		this.hotel_name = hotel_name;
		this.city = city;
		this.price_per_night = price_per_night;
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPrice_per_night() {
		return price_per_night;
	}

	public void setPrice_per_night(Integer price_per_night) {
		this.price_per_night = price_per_night;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", hotel_name=" + hotel_name + ", city=" + city + ", price_per_night="
				+ price_per_night + "]";
		}
}