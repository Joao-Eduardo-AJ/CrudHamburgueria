package br.com.syonet.hamburgueria.dao.cliente;

import java.util.List;

import br.com.syonet.hamburgueria.dao.crud.CrudDAOImpl;
import br.com.syonet.hamburgueria.repository.Cliente;
import br.com.syonet.hamburgueria.service.JPAService;

public class ClienteDAOImpl extends CrudDAOImpl implements ClienteDAO {

	private static JPAService service = JPAService.getInstance();

	@Override
	public List<Cliente> listAll() {
		return service.runOperation(
				manager -> manager.createQuery("select sc from Cliente sc", Cliente.class).getResultList());
	}

	@Override
	public Cliente findById(Integer id) {
		return service.runOperation(manager -> manager
				.createQuery("select sc from Cliente where sc.id = " + id, Cliente.class).getSingleResult());
	}
}
