package br.com.syonet.hamburgueria.dao.hamburgueria;

import java.util.List;

import br.com.syonet.hamburgueria.repository.Hamburgueria;

public interface HamburgueriaDAO {

	List<Hamburgueria> listAll();

	Hamburgueria findById(Integer id);
}
