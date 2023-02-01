package com.sou.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sou.model.Product;
import com.sou.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService pserv;
	
	@RequestMapping(value = {"/home.htm"})
	public String ProductHome() {
		return "product_home";
	}
	@RequestMapping(value = {"/contactus.htm"})
	public String contactus() {
		return "contactus";
	}
	
	@RequestMapping(value = {"/aboutus.htm"})
	public String Productaboutus() {
		return "aboutus";
	}
	@RequestMapping(value = {"/customer_reg_form.htm"})
	public String customregform() {
		return "customer_reg_form";
	}
	
	@RequestMapping(value = {"/product_add_form.htm"})
	public String ProductAddForm(ModelMap model) {
		model.put("product", new Product());
		List<Product> lst = pserv.getAll();
		model.put("products", lst);
		return "product_add_form";
	}
	
	@RequestMapping(value = {"/product_add.htm"},method = RequestMethod.POST)
	public String carAdd(Product p, ModelMap model) {
		pserv.save(p);
		model.put("product", new Product());
		List<Product> lst = pserv.getAll();
		model.put("products", lst);
		return "product_add_form";
	}
	@RequestMapping(value = {"/product_orders.htm"},method = RequestMethod.GET)
	public String carList(ModelMap model) {
		List<Product> lst = pserv.getAll();
		model.put("products", lst);
		return "product_orders";
	}
	@RequestMapping(value = {"/product_delete.htm"},method = RequestMethod.GET)
	public String carDelete(@RequestParam(name = "id") int id, ModelMap model) {
		pserv.removeByID(id);
		List<Product> lst = pserv.getAll();
		model.put("products", lst);
		return "product_orders";
	}
	@RequestMapping(value = {"/product_update_form.htm"},method = RequestMethod.GET)
	public String productUpdateForm(@RequestParam(name = "id") int id, ModelMap model) {
	     Product p = pserv.getByID(id);
		model.put("product", p);
		return "product_update_form";
	}
	
	@RequestMapping(value = {"/product_update.htm"},method = RequestMethod.POST)
	public String productUpdate(Product p, ModelMap model) {
		pserv.modify(p);
		List<Product> lst = pserv.getAll();
		model.put("products", lst);
		return "product_orders";
	}
}
