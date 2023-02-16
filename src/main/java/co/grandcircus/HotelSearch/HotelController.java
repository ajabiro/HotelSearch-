package co.grandcircus.HotelSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HotelController {
	
	@Autowired
	private HotelRepository repo;

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/hotel-results")
	public String listOfHotels(@RequestParam String name ) {
		return "results"; 
	}

}