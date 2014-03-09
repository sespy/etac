package io.espy.etac.service;

import io.espy.etac.dao.AApplicationDao;
import io.espy.etac.model.AApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AApplicationService {

	@Autowired
	AApplicationDao aApplicationDao;

	public String ping() {
		return "pong";
	}

	public List<AApplication> findAll() {
		return aApplicationDao.findAll();
	}
}
