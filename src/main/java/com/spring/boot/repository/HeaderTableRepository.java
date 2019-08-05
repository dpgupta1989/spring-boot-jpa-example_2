package com.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.spring.boot.model.HeaderTable;

import java.util.List;

public interface HeaderTableRepository extends JpaRepository<HeaderTable, Integer> {
    List<HeaderTable> findBySeqNbr(Integer seqNbr);
}
