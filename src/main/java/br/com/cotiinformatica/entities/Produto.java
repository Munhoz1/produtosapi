package br.com.cotiinformatica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "produto")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproduto")
	private Integer idProduto;

	@Column(name = "nome", length = 150, nullable = false)
	private String nome;

	@Column(name = "descricao", length = 500, nullable = false)
	private String descricao;

	@Column(name = "preco", nullable = false)
	private Double preco;

	@Column(name = "quantidade", nullable = false)
	private Integer quantidade;

	@ManyToOne // Muitos Produtos para 1 Fornecedor
	@JoinColumn(name = "idfornecedor") // campo chave estrangeira
	private Fornecedor fornecedor;

}
