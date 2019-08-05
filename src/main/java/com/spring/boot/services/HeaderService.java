
package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.boot.model.DetailsTable;
import com.spring.boot.model.HeaderTable;
import com.spring.boot.repository.DetailsTableRepository;
import com.spring.boot.repository.HeaderTableRepository;

@Service
public class HeaderService {

	@Autowired(required=true)
	HeaderTableRepository headerTableRepository;

	@Autowired(required=true)
	DetailsTableRepository detailsTableRepository;
	
	@Transactional
	public List<HeaderTable> getAllHeader() {
		return (List<HeaderTable>) headerTableRepository.findAll();
	}

	@Transactional
	public List<HeaderTable> findBySeqNbr(Integer seqNbr) {
		return headerTableRepository.findBySeqNbr(seqNbr);
//		return headerTableRepository.findAll();
	}

	@Transactional
	public List<DetailsTable> getAllDetails(){
		return detailsTableRepository.findAll();
	}
	
	@Transactional
	public List<DetailsTable> findDetailsBySeqNbr(Integer seqNbr){
		return detailsTableRepository.findAllBySeqNbr(seqNbr);
	}

//	@Transactional
//	public void deletePerson(Long personId) {
//		headerTableRepository.delete(personId);
//	}

	@Transactional
	public boolean addPerson(HeaderTable person) {
		return headerTableRepository.save(person) != null;
	}

	@Transactional
	public boolean updatePerson(HeaderTable person) {
		return headerTableRepository.save(person) != null;
	}
}
