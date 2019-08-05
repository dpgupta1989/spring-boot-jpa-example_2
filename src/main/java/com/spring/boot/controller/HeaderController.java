package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.model.DetailsTable;
import com.spring.boot.model.HeaderTable;
import com.spring.boot.repository.HeaderTableRepository;
import com.spring.boot.services.HeaderService;

@RestController
@RequestMapping("/jpa/swagger")
public class HeaderController {
	
	@Autowired
	HeaderService headerService;

//	@ResponseBody
//    @RequestMapping("/")
//    public String home() {
//        String html = "";
//        html += "<ul>";
//        html += " <li><a href='/jpa/swagger/header'>Show Header Data</a></li>";
//        html += " <li><a href='/jpa/swagger/header/12'>Show Header Data By Seq Nbr</a></li>";
//        html += " <li><a href='/jpa/swagger/details'>Show Details Data</a></li>";
//        html += " <li><a href='/jpa/swagger/details/12'>Show Details By Seq Nbr</a></li>";
//        html += "</ul>";
//        return html;
//    }
	
	@GetMapping("/header/{seqNbr}")
	public @ResponseBody List<HeaderTable> getAllUsers(@PathVariable Integer seqNbr) {
		return headerService.findBySeqNbr(seqNbr);
	}

	@GetMapping("/header")
	public List<HeaderTable> getAllHeader() {
		System.out.println("@@@@@@@@@@@@@@Inside getAll method");
		return headerService.getAllHeader();
	}
	
	@GetMapping("/details")
	public List<DetailsTable> getAllDetails(){
		return headerService.getAllDetails();
	}
	
	@GetMapping("/details/{seqNbr}")
	public List<DetailsTable> getDetailsBySeqNbr(@PathVariable Integer seqNbr){
		return headerService.findDetailsBySeqNbr(seqNbr);
	}

	@RequestMapping(value = "/header", method = RequestMethod.POST)
	public HttpStatus insertPersone(@RequestBody HeaderTable person) {
		return headerService.addPerson(person) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/header", method = RequestMethod.PUT)
	public HttpStatus updatePerson(@RequestBody HeaderTable person) {
		return headerService.updatePerson(person) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
}
