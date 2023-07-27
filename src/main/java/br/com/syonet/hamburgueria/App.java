package br.com.syonet.hamburgueria;

import java.util.List;

import br.com.syonet.hamburgueria.dao.crud.CrudDAOImpl;
import br.com.syonet.hamburgueria.dao.hamburgueria.HamburgueriaDAOImpl;
import br.com.syonet.hamburgueria.dao.pedido.PedidoDAOImpl;
import br.com.syonet.hamburgueria.repository.Hamburgueria;
import br.com.syonet.hamburgueria.repository.Pedido;
import br.com.syonet.hamburgueria.service.JPAService;

public class App {

	private static CrudDAOImpl crud = new CrudDAOImpl();
	private static HamburgueriaDAOImpl ham = new HamburgueriaDAOImpl();
	private static PedidoDAOImpl ped = new PedidoDAOImpl();

	public static void main(String[] args) {
		Hamburgueria hamburgueria = new Hamburgueria();
		hamburgueria.setCnpj("12345678912345");
		hamburgueria.setName("Burguers");

		crud.insert(hamburgueria);

		List<Hamburgueria> listaHamburguerias = ham.listAll();

		System.out.println("\n\n   ---- Lista de HAMBURGUERIAS: ");
		listaHamburguerias.forEach(hamb -> System.out.println("Nome: " + hamb.getName()));
		System.out.println("==============================");

		Pedido pedido1 = new Pedido();
		pedido1.setDescricao("Sem cebola");
		pedido1.setHamburgueria(hamburgueria);
		
		Pedido pedido2= new Pedido();
		pedido2.setDescricao("Sem alface");
		pedido2.setHamburgueria(hamburgueria);
		
		Pedido pedido3 = new Pedido();
		pedido3.setDescricao("Sem pão fds kkkkk");
		pedido3.setHamburgueria(hamburgueria);

		crud.insert(pedido1);
		crud.insert(pedido2);
		crud.insert(pedido3);

		List<Pedido> listaPedidos = ped.listAll();

		System.out.println("\n\n   ---- Lista de PEDIDOS: ");
		listaPedidos.forEach(ped -> System.out.println("Descrição: " + ped.getDescricao()));
		System.out.println("==============================");
	}
}
