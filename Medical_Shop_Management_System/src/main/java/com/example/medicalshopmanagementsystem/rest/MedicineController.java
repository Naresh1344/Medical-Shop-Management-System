package com.example.medicalshopmanagementsystem.rest;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.medicalshopmanagementsystem.entity.Medicine;
import com.example.medicalshopmanagementsystem.service.MedicineService;


@Controller
@RequestMapping("/medicines")
public class MedicineController {

	private MedicineService medicineService;
	
	public MedicineController(MedicineService theMedicineService) {
		medicineService = theMedicineService;
	}

	// add mapping for "/list"

	@GetMapping("/list")
	public String listMedicines(Model theModel) {
		
		// get Medicines from database
		List<Medicine> theMedicines = medicineService.findAll();
		
		// add to the spring model
		theModel.addAttribute("medicines", theMedicines);
		
		return "medicines/list-medicines";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Medicine theMedicine = new Medicine();
		
		theModel.addAttribute("medicine", theMedicine);
		
		return "medicines/medicine-form";
	}

	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("medicineId") int theId,Model theModel) {
		
		// get the Medicine from the service
		Medicine theMedicine = medicineService.findById(theId);
		
		// set Medicine as a model attribute to pre-populate the form
		theModel.addAttribute("medicine", theMedicine);
		
		// send over to our form
		return "medicines/medicine-form";			
	}
	
	
	@PostMapping("/save")
	public String saveMedicine(@ModelAttribute("medicine") Medicine theMedicine) {
		
		// save the Medicine
		medicineService.save(theMedicine);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/medicines/list";
	}
	
	
	@PostMapping("/delete")
	public String delete(@RequestParam("medicineId") int theId) {
		
		// delete the medicine
		medicineService.deleteById(theId);
		
		// redirect to /medicines/list
		return "redirect:/medicines/list";
		
	}
}

