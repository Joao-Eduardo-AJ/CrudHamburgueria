package br.com.syonet.hamburgueria.dao.pedido;

import java.util.List;

import br.com.syonet.hamburgueria.repository.Pedido;

public interface PedidoDAO {

	public List<Pedido> listAll();

	public Pedido findById(Integer id);
}
