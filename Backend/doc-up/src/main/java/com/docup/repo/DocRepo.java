package com.docup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docup.entity.Doc;

@Repository
public interface DocRepo extends JpaRepository<Doc, Long>{
	
	

}
