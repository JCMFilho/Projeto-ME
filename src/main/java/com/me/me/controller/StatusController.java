package com.me.me.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.me.me.DTO.StatusDTO;
import com.me.me.DTO.StatusRetornoDTO;
import com.me.me.service.StatusService;


@RestController
@RequestMapping("/api/status")
@CrossOrigin
public class StatusController {

	private final StatusService statusService;
	
	public StatusController(StatusService statusService) {
		this.statusService = statusService;
	}
	
	@PostMapping
	private ResponseEntity<StatusRetornoDTO> retornaStatus(@RequestBody StatusDTO status){
		return ResponseEntity.ok(this.statusService.retornaStatus(status));
	}
	
}
