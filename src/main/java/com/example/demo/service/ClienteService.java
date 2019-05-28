/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

/**
 *
 * @author Raffael
 */
import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public ClienteService() {
    }

    public void cadastrarCliente(Cliente cli) {
        clienteRepository.save(cli);
    }

    public void editarCliente(Cliente cli) {
        clienteRepository.save(cli);
    }

    public void excluirCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente buscaCliente(Long id) {
        return clienteRepository.findById(id).get();
    }

    /*
    public java.util.List<Cliente> buscaTodos() {
        return clienteRepository.buscaEOrdenaPorID();
    }
     */

    public Cliente autenticarCliente(Cliente cli) {
        return clienteRepository.findByEmailAndSenha(cli.getEmail(), cli.getSenha());
    }
}
