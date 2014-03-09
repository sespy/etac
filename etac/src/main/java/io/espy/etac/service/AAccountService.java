package io.espy.etac.service;

import io.espy.etac.dao.AAccountDao;
import io.espy.etac.model.AAccount;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AAccountService {

	@Autowired
	AAccountDao aAccountDao;

	public AAccount insert(AAccount a) {
		return aAccountDao.insert(a);
	}
	
	public List<AAccount> findAll() {
		return aAccountDao.findAll();
	}
}
