package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class service {
	@Autowired
	repositaryClass userRepo;

	@Transactional(rollbackFor = Exception.class, timeout = 20, readOnly = false)
	public void transfer(long from, long to, double bal) {
		if (check1(from, bal) && check2(to, bal) && bal < 10000) {
			userRepo.debit(from, bal);
			userRepo.credit(to, bal);
		}

		else {
			throw new RuntimeException("Transctin Not Possibel");
		}

	}

	public boolean check1(long from, double bal) {
		double fromvalid = userRepo.Fromvalid(from);
		if (fromvalid > bal && bal >= 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean check2(long to, double bal) {
		double tovalid = userRepo.tovalid(to);
		if (tovalid > bal && bal >= 0) {
			return true;
		} else {
			return false;
		}
	}

}
