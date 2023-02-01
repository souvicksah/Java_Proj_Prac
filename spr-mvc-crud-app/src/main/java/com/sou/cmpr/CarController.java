package com.sou.cmpr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.sou.model.Car;
import com.sou.service.CarService;
import com.sou.service.CarValidator;

@Controller
public class CarController {

	@Autowired
	private CarService carservice; 
	
	@Autowired
	private CarValidator carvalidator;
	
	@RequestMapping(value= {"/car_add_form.htm"})
	public String carAddForm(ModelMap model) {
		model.put("car",new Car());
		return "car_add_form";
	}
	
	@RequestMapping(value= {"/car_add.htm"},method=RequestMethod.POST)
	public String carAdd(Car car,BindingResult result,ModelMap model) {//record is stored in car object since we used spring tag where in commandName we gave the same name
		
		carvalidator.validate(car, result);
		 if(result.hasErrors())
			 return "car_add_form";
		
		carservice.add(car);
		model.put("car", car);
		return "car_add_form";
	}
	@RequestMapping(value= {"/car_list.htm"},method=RequestMethod.GET)
	public String carList(ModelMap model) {//record is stored in car object since we used spring tag where in commandName we gave the same name
		List<Car> lst=carservice.getAll();
		model.put("cars", lst);
		return "car_list";
	}
	@RequestMapping(value= {"/car_delete.htm"},method=RequestMethod.GET)
	public String carDelete(@RequestParam(name="id") int id,ModelMap model) {//record is stored in car object since we used spring tag where in commandName we gave the same name
		carservice.removeByID(id);
		List<Car> lst=carservice.getAll();
		model.put("cars", lst);
		return "car_list";
	}
	@RequestMapping(value= {"/car_update_form.htm"},method=RequestMethod.GET)
	public String carUpdateForm(@RequestParam(name="id") int id,ModelMap model) {//record is stored in car object since we used spring tag where in commandName we gave the same name
		Car c=carservice.getByID(id);
		model.put("car", c);
		return "car_update_form";
	}
	@RequestMapping(value= {"/car_update.htm"},method=RequestMethod.POST)
	public String carUpdate(Car car,ModelMap model) {//record is stored in car object since we used spring tag where in commandName we gave the same name
		carservice.modify(car);
		List<Car> lst=carservice.getAll();
		model.put("cars", lst);
		return "car_list";
	}
	
	@RequestMapping(value= {"/car_upload.htm"},method=RequestMethod.POST)
	public String carUpload(@RequestParam int id, @RequestParam CommonsMultipartFile image, ModelMap model, HttpServletRequest request) {//record is stored in car object since we used spring tag where in commandName we gave the same name
		try{
			ServletContext sc=request.getServletContext();
		  String filepath=sc.getRealPath("images"); 
		  Path path=Paths.get(filepath);
		   if(!Files.exists(path)) {
				Files.createDirectory(path);
			}
		   
		   String filename=image.getOriginalFilename();
		   filename = filename.substring(filename.lastIndexOf('.')); 
			filename = id+filename;
			path = path.resolve(filename); 
			Files.copy(image.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
			System.out.println(path);
			carservice.upload(id, filename);
			//carservice.upload(id, filename);
		   
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		List<Car> lst=carservice.getAll();
		model.put("cars", lst);
		return "car_list";
	}
	
}
