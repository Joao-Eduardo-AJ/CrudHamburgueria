package br.com.syonet.hamburgueria.dao.produto;

import java.util.List;

import br.com.syonet.hamburgueria.repository.Produto;

public interface ProdutoDAO {

	public List<Produto> listAll();

	public Produto findById(Integer id);
}
