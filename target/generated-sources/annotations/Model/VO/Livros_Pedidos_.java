package Model.VO;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Livros_Pedidos.class)
public abstract class Livros_Pedidos_ {

	public static volatile ListAttribute<Livros_Pedidos, Venda> vendaId;
	public static volatile SingularAttribute<Livros_Pedidos, Long> livrosPedidosId;
	public static volatile SingularAttribute<Livros_Pedidos, Integer> livrosPedidosQuantidade;
	public static volatile SingularAttribute<Livros_Pedidos, Pedido> livrosPedidosPedidoId;
	public static volatile SingularAttribute<Livros_Pedidos, Livro> livrosPedidosLivroId;

}

