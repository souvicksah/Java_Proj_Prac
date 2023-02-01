package com.sou.cmpr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sou.model.Car;
import com.sou.service.CarService;

@Controller
public class CarController {

	@Autowired
	private CarService carservice;  
	
	@RequestMapping(value= {"/car_add_form.htm"})
	public String carAddForm(ModelMap model) {
		model.put("car",new Car());
		return "car_add_form";
	}
	
	@RequestMapping(value= {"/car_add.htm"},method=RequestMethod.POST)
	public String carAdd(Car car,ModelMap model) {
		carservice.add(car);
		model.put("car", car);
		
		return "car_add_form";
	}
}
