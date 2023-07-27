package br.com.syonet.hamburgueria.dao.crud;

import br.com.syonet.hamburgueria.service.JPAService;

public class CrudDAOImpl {
	private static JPAService service = JPAService.getInstance();

	public <T> void insert(T entity) {
		service.runOperation(manager -> {
			manager.persist(entity);
			return null;
		});
	}

	public <T> void update(T entity) {
		service.runOperation(manager -> {
			manager.merge(entity);
			return null;
		});
	}

	public <T> void delete(T entity) {
		service.runOperation(manager -> {
			manager.remove(entity);
			return null;
		});
	}
}
