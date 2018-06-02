package com.cml.demo.vaadin.VaadinSwarm;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class ClientServiceDb implements ClientService {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Client findByID(Integer clientID) {
		return em.find(Client.class, clientID);
	}

	@Override
	public List<Client> findAll() {
		return em.createNamedQuery(Client.NQ_FIND_ALL, Client.class).getResultList();
	}

}
