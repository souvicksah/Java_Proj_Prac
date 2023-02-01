package com.sou.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sou.model.Product;
import com.sou.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService pserv;
@PostMapping(value= {"/product"})
public String productAdd(@RequestBody Product product) {
	
	pserv.save(product);
	return "success";
}

@PutMapping(value= {"/product"})
public String productupdate(@RequestBody Product product) {
	
	pserv.save(product);
	return "success";
}
@DeleteMapping(value= {"/product/{id}"})
public void removebyId(@PathVariable int id) {
	pserv.deleteById(id);
}
@GetMapping(value = {"/product/{id}"})
public Product productGet(@PathVariable int id) {
	return pserv.selectById(id);
}

@GetMapping(value = {"/product"})
public List<Product> productList(){
	return pserv.getAll();
}
}
