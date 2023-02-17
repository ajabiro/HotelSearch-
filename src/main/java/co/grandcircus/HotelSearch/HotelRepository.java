package co.grandcircus.HotelSearch;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository <Hotel, Long>{

	//this list is going to access the Hotel.java class we created the table in 
	List<Hotel> findByCity(String city);
	
	 List<Hotel> findByCityOrderByPricePerNightAsc(String city);
}
