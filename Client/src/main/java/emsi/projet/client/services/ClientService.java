package emsi.projet.client.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emsi.projet.client.entities.Client;
import emsi.projet.client.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> findAll(){
		return clientRepository.findAll();
	}
	
	public Client findById(Long id) throws Exception{
		return clientRepository.findById(id).orElseThrow(()-> new
				Exception("Invalid Client ID"));
	}
	
	public void addClient(Client client) {
		clientRepository.save(client);
	}
}
