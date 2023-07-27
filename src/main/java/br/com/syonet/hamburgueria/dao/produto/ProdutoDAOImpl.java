package br.com.syonet.hamburgueria.dao.produto;

import java.util.List;

import br.com.syonet.hamburgueria.dao.crud.CrudDAOImpl;
import br.com.syonet.hamburgueria.repository.Produto;
import br.com.syonet.hamburgueria.service.JPAService;

public class ProdutoDAOImpl extends CrudDAOImpl implements ProdutoDAO {

	private static JPAService service = JPAService.getInstance();

	@Override
	public List<Produto> listAll() {
		return service.runOperation(
				manager -> manager.createQuery("select sp from Produto sp", Produto.class).getResultList());
	}

	@Override
	public Produto findById(Integer id) {
		return service.runOperation(manager -> manager
				.createQuery("select sp from Produto sp where sp.id = " + id, Produto.class).getSingleResult());
	}
}
