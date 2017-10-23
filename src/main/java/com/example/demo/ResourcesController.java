/**
 * 
 */
package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author j.venugopalan
 *
 */
@RestController
public class ResourcesController {

	
	@RequestMapping(value="/employees", method = RequestMethod.GET)
	String getEmployeeDetails(){
		return "Hello";
	}
}
