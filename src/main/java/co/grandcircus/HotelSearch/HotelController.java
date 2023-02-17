package co.grandcircus.HotelSearch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
	@RequestMapping("/results")
	public String hotelResults(@RequestParam String city, Model model) {
		List<Hotel> hotelsList;
		hotelsList = repo.findByCityOrderByPricePerNightAsc(city);
		model.addAttribute("hotels", hotelsList);
		model.addAttribute("city", city);
	
	
		return "results"; 
	}

}