package br.com.syonet.hamburgueria.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Pedido")
@Table(name = "syo_pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "id_hamburgueria", referencedColumnName = "id", nullable = false)
	private Hamburgueria hamburgueria;

	@ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Cliente cliente;
	
	@Column(name = "dt_inc", columnDefinition = "TIMESTAMP")
	private LocalDateTime dataInc = LocalDateTime.now();

	@OneToMany
    @JoinTable(
        name = "syo_pedido_produto",
        joinColumns = @JoinColumn(name = "pedido_id"),
        inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
	private List<Produto> produtos;
	
	@Column(name = "ds_pedido", columnDefinition = "text default 'sem descricao'")
	private String descricao;
	
	@Column(name = "sts_pedido")
	private Status status;

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

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
