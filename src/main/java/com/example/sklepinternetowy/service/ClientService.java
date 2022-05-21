package com.example.sklepinternetowy.service;

import com.example.sklepinternetowy.model.Client;
import com.example.sklepinternetowy.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void addClient(Client client){
        clientRepository.save(client);
        System.out.println("Dodani klienta o id: " + client.getId());
    }

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }
    public Client getClient(Long id){
        return clientRepository.findById(id).orElse(null);
    }
    public void editClient(Client client){
        clientRepository.save(client);
    }
    public void deleteClient(Long id){
        clientRepository.deleteById(id);
    }

}
