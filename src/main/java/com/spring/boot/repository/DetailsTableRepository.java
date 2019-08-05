package com.spring.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.spring.boot.model.DetailsTable;


public interface DetailsTableRepository extends JpaRepository<DetailsTable, Integer>{
	List<DetailsTable> findAllBySeqNbr(Integer seqNbr);
}
