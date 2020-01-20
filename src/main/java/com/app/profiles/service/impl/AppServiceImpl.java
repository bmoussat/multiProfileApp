package com.app.profiles.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.profiles.model.Item;
import com.app.profiles.repository.AppRepository;
import com.app.profiles.service.AppService;

@Service
public class AppServiceImpl implements AppService {

	@Autowired
	private AppRepository repository;

	@Override
	public List<Item> getItems() {
		return repository.getItems();
	}

}
