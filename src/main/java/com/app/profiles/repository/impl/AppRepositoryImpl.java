package com.app.profiles.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.app.profiles.model.Item;
import com.app.profiles.repository.AppRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class AppRepositoryImpl implements AppRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Item> getItems() {
		String query = "SELECT r4i FROM R4Item r4i";
		Query r4ItemQuery = entityManager.createQuery(query);

		@SuppressWarnings("unchecked")
		List<Item> items = (List<Item>) r4ItemQuery.getResultList();

		return items;
	}

}
