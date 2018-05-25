package com.kgisl.nsedata.controller;

import java.util.*;
import com.kgisl.nsedata.*;
import com.kgisl.nsedata.model.NseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import io.swagger.models.Model;


@RestController
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RequestMapping("api/nse")
public class NseController {
	NseData nse=new NseData();
	//  nseDatas:Object;
	// @Autowire
	// private NseService nseService;
		//RestTemplate restTemplate ;
	//  RestTemplate <restTemplate> ;
	RestTemplate restTemplate = new RestTemplate();
		@RequestMapping(value={"showNseData"},method={RequestMethod.GET})
		public String showUserTable(){
		    Object nseDatas = restTemplate.getForObject("https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/client/RestTemplate.html", NseData.class,nse);  // or however I use restTemplates, havent done it yet so still fuzzy but shouldnt be too tricky.    
		  String data = String.valueOf(nseDatas);
		  return data;
		
		//   model.addAttribute("nseDatas", nseDatas);
		//   return "server"; // returns a jsp simply looping through the list and displaying.
		}
}

	

