package br.com.syonet.hamburgueria.repository;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Produto")
@Table(name = "syo_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "id_hamburgueria", referencedColumnName = "id", nullable = false)
	private Hamburgueria hamburgueria;

	@Column(name = "dt_inc", columnDefinition = "TIMESTAMP")
	private LocalDateTime dataInc = LocalDateTime.now();

	@Column(name = "ds_produto", columnDefinition = "text default 'sem informacoes sobre o produto'")
	private String descricao;
	
	@Column(name = "ds_preco")
	private String preco;
	
	@Column(name = "qt_estoque")
	private int quantidade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Hamburgueria getHamburgueria() {
		return hamburgueria;
	}

	public void setHamburgueria(Hamburgueria hamburgueria) {
		this.hamburgueria = hamburgueria;
	}

	public LocalDateTime getDataInc() {
		return dataInc;
	}

	public void setDataInc(LocalDateTime dataInc) {
		this.dataInc = dataInc;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String desciption) {
		this.descricao = desciption;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
