package com.Staff.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Staff.Model.StaffEmployement;
import com.Staff.Service.StaffEmploymentService;

@RestController
@RequestMapping("/api/staffEmployment")
public class StaffEmploymentController {

@Autowired
 private final StaffEmploymentService staffEmploymentService;

 
 public StaffEmploymentController(StaffEmploymentService staffEmploymentService) {
     this.staffEmploymentService = staffEmploymentService;
 }

 @PostMapping
 public String submitForm(StaffEmployement staffEmployement) {
     staffEmploymentService.saveStaffEmployment(staffEmployement);
     // Redirect to a success page or return a response as needed
     return "redirect:/success";
 }
}
