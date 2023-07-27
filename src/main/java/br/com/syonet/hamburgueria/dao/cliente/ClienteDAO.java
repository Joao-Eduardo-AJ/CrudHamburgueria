package br.com.syonet.hamburgueria.dao.cliente;

import java.util.List;

import br.com.syonet.hamburgueria.repository.Cliente;

public interface ClienteDAO {
	public List<Cliente> listAll();

	public Cliente findById(Integer id);
}
