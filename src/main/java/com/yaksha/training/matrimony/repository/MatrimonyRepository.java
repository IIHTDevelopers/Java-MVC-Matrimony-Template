package com.yaksha.training.matrimony.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.matrimony.entity.Matrimony;

public interface MatrimonyRepository extends JpaRepository<Matrimony, Long> {

	// feel free to update this
	Page<Matrimony> findAllMatrimony(Pageable pageable);

	// feel free to update this
	Page<Matrimony> findByNameOrReligionOrOccupation(@Param("keyword") String keyword, Pageable pageable);

	// feel free to update this
	void updateMatchFound(@Param("id") Long id);

}
