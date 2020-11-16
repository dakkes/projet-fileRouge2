package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Client;

public class ClientService {

	private ArrayList<Client> clients;

	public ClientService() {
		clients = new ArrayList<Client>();
	}

	public ClientService(ArrayList<Client> clients) {
		super();
		this.clients = clients;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public void save(Client client) {
		clients.add(client);
	}

	public void remove(Client client) {
		clients.remove(client);
	}

	public void update(Client client) {
		for (Client clien : clients) {
			if (clien.getId() == client.getId()) {
				clien = client;
			}
		}
	}

	public ArrayList<Client> findAll() {
		return clients;
	}

	public Client findById(int id) {
		for (int i = 0; i < clients.size(); i++) {
			Client findClientById = clients.get(i);
			if (id == findClientById.getId()) {
				return clients.get(i);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "ClientService [clients=" + clients + "]";
	}

}