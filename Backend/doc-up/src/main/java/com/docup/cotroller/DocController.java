package com.docup.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.docup.dto.DocDTO;
import com.docup.service.DocService;

@RestController
@RequestMapping("/doc")
public class DocController {
	
	@Autowired
	DocService service;

	@PostMapping(value="/register")
	public ResponseEntity<Long> registerDoc(@RequestBody DocDTO dto) {
		
		return ResponseEntity.ok(service.registerDoc(dto));
	}
	
	@GetMapping(value="/get/{id}")
	public ResponseEntity<DocDTO> getDoc(@PathVariable long id){
		return ResponseEntity.ok(service.getDoc(id));
	}
	
	@GetMapping(value="/getAll")
	public ResponseEntity<List<DocDTO>> getAllDocs(){
		return ResponseEntity.ok(service.getAllDocs());
	}
}

