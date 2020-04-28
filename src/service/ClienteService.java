package service;

import model.Cliente;

import java.util.ArrayList;

import dao.ClienteDAO;


public class ClienteService {
	ClienteDAO dao = new ClienteDAO();
	Cliente cliente = new Cliente();
	
	public int criar(Cliente cliente) {
		return dao.criar(cliente);
	}
	
	public void atualizar(Cliente cliente){
		dao.atualizar(cliente);
	}
	
	public void excluir(int id){
		dao.excluir(id);
	}
	
	public Cliente carregar(int id){
		return dao.carregar(id);
	}
	
	

}