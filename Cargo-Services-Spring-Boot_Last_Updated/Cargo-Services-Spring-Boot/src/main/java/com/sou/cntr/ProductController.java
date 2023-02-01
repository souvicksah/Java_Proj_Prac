package com.sou.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.sou.model.Product;
import com.sou.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService pserv;
	
	@PostMapping(path = "/product_add_form")
	String productAddForm(@RequestBody Product product,Model model) {
		pserv.add(product);
		model.addAttribute("products",pserv.getAll());
		return "add_product";
	}
	
	@RequestMapping("/addproduct") 
	public String addproduct(Model model) { 
		model.addAttribute("products",pserv.getAll());
	    return "add_product"; 
	}

//	
//	@PostMapping(value = {"/product_add_form.htm"})
//	public String ProductAddForm(@RequestBody Product p) {
//		pserv.add(p);
//		return "success";
//	}
//	
//	@PutMapping(value = {"/product_update_form.htm"})
//	public String productUpdate(@RequestBody Product product) {
//		pserv.modify(product);
//		return "success";
//	}
//	
//	
	/*
	 * @DeleteMapping(value = {"/deleteproduct"}) public String
	 * productDelete(@RequestParam int id,Model model) {
	 * //System.out.println("first delete"); pserv.removeById(id);
	 * model.addAttribute("products",pserv.getAll()); return "product_orders";
	 * 
	 * }
	 */
	 
//	
//	@DeleteMapping(value = {"/product_delete.htm/{id}"})
//	public String productDelete1(@PathVariable int id) {
//		//System.out.println("second delete");
//		pserv.removeById(id);
//		return "success";
//	}
//	
//	@GetMapping(value = {"/product_orders.htm/{id}"})
//	public Product productGet(@PathVariable int id) {
//		return pserv.getById(id);
//	}
//	
//	@GetMapping(value = {"/product_getAll.htm"})
//	public List<Product> productList(){
//		return pserv.getAll();
//	}
	@RequestMapping(value = {"/deleteproduct"},method = RequestMethod.GET)
	public String carDelete(@RequestParam(name = "id") int id, ModelMap model) {
		pserv.removeById(id);
		List<Product> lst = pserv.getAll();
		model.put("products", lst);
		return "add_product";
	}
	
	
	@GetMapping("/orders")
	public String viewProducts(Model model) {
	    model.addAttribute("products",pserv.getAll());
	    return "product_orders";
	}

	@PutMapping(value = {"/product"})
	public String productUpdate(@RequestBody Product product) {
		pserv.modify(product);
		return "add_product";
	}
		@GetMapping(value = {"/product_update_form/{id}"})
	public String productGet(@PathVariable int id,Model model) {
			model.addAttribute("product",pserv.getById(id));
			
		return "product_update_form";
		
	}
}
