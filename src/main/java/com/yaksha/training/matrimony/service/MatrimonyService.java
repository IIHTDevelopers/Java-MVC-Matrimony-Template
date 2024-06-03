package com.yaksha.training.matrimony.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yaksha.training.matrimony.entity.Matrimony;

@Service
public class MatrimonyService {

	public Page<Matrimony> getMatrimonys(Pageable pageable) {
		// write your logic here
		return null;
	}

	public Matrimony saveMatrimony(Matrimony matrimony) {
		// write your logic here
		return null;
	}

	public Matrimony getMatrimony(Long id) {
		// write your logic here
		return null;
	}

	public boolean deleteMatrimony(Long id) {
		// write your logic here
		return false;
	}

	public Page<Matrimony> searchMatrimonys(String theSearchName, Pageable pageable) {
		// write your logic here
		return null;
	}

	public boolean updateMatrimonyMatchFound(Long id) {
		// write your logic here
		return false;
	}
}
