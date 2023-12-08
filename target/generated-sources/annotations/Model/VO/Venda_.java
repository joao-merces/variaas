package Model.VO;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Venda.class)
public abstract class Venda_ {

	public static volatile SingularAttribute<Venda, Long> vendaId;
	public static volatile SingularAttribute<Venda, String> vendaMetodoPagamento;
	public static volatile SingularAttribute<Venda, Float> vendaTotal;
	public static volatile SingularAttribute<Venda, Livros_Pedidos> vendaLivrosPedidosId;

}

