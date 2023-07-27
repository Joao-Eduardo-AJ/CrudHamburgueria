package br.com.syonet.hamburgueria.dao.pedido;

import java.util.List;

import br.com.syonet.hamburgueria.dao.crud.CrudDAOImpl;
import br.com.syonet.hamburgueria.repository.Pedido;
import br.com.syonet.hamburgueria.service.JPAService;

public class PedidoDAOImpl extends CrudDAOImpl implements PedidoDAO {

	private static JPAService service = JPAService.getInstance();

	@Override
	public List<Pedido> listAll() {
		return service.runOperation(
				manager -> manager.createQuery("select sp from Pedido sp", Pedido.class).getResultList());
	}

	@Override
	public Pedido findById(Integer id) {
		return service.runOperation(manager -> manager
				.createQuery("select sp from Pedido sp where sp.id = " + id, Pedido.class).getSingleResult());
	}
}
