package br.com.syonet.hamburgueria.dao.hamburgueria;

import java.util.List;

import br.com.syonet.hamburgueria.dao.crud.CrudDAOImpl;
import br.com.syonet.hamburgueria.repository.Hamburgueria;
import br.com.syonet.hamburgueria.service.JPAService;

public class HamburgueriaDAOImpl extends CrudDAOImpl implements HamburgueriaDAO {

	private static JPAService service = JPAService.getInstance();

	@Override
	public List<Hamburgueria> listAll() {
		return service.runOperation(
				manager -> manager.createQuery("select sh from Hamburgueria sh", Hamburgueria.class).getResultList());
	}

	@Override
	public Hamburgueria findById(Integer id) {
		return service.runOperation(manager -> manager
				.createQuery("select sh from Hamburgueria sh where sh.id = " + id, Hamburgueria.class).getSingleResult());
	}
}
