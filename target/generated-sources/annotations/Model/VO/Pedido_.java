package Model.VO;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pedido.class)
public abstract class Pedido_ {

	public static volatile SingularAttribute<Pedido, Long> pedidoId;
	public static volatile SingularAttribute<Pedido, String> pedidoSituacao;
	public static volatile SingularAttribute<Pedido, Endereco> endereco;
	public static volatile SingularAttribute<Pedido, Funcionario> pedidoFuncionarioId;
	public static volatile ListAttribute<Pedido, Livros_Pedidos> livrosPedidosId;
	public static volatile SingularAttribute<Pedido, LocalDate> pedidoData;
	public static volatile SingularAttribute<Pedido, Cliente> pedidoClienteId;

}

