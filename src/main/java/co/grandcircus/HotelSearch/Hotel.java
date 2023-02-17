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
	private String hotelName;
	private String city;
	private Integer pricePerNight;

	
	//no args constructor
	public Hotel() {
	}
	
	//constructor with 4 attributes
	public Hotel(Long id, String hotelName, String city, Integer pricePerNight) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.city = city;
		this.pricePerNight = pricePerNight;
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotel_name(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNightt(Integer PricePerNight) {
		this.pricePerNight = PricePerNight;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", hotelName=" + hotelName + ", city=" + city + ", PricePerNight="
				+ pricePerNight + "]";
		}
}