package com.docup.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docup.dto.DocDTO;
import com.docup.entity.Doc;
import com.docup.repo.DocRepo;

@Service
public class DocService {
	
	@Autowired
	DocRepo repo;
	
	public Long registerDoc(DocDTO dto) {
		
		Doc doc = new Doc();
		doc = DocDTO.prepareEntity(dto);
		doc = repo.saveAndFlush(doc);
		return doc.getId();
	}

	public DocDTO getDoc(long id) {
		
		Optional<Doc> ob = repo.findById(id);
		Doc obj = ob.get();
		return DocDTO.prepareDTO(obj);
	}
}
