package com.cml.demo.vaadin.VaadinSwarm;

import java.util.List;

public interface ClientService {

	Client findByID(Integer clientID);

	List<Client> findAll();
}
