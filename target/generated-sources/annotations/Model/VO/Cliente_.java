package Model.VO;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ {

	public static volatile SingularAttribute<Cliente, String> clienteCPF;
	public static volatile SingularAttribute<Cliente, Long> clienteId;
	public static volatile ListAttribute<Cliente, Pedido> pedidoId;
	public static volatile SingularAttribute<Cliente, String> clienteSenha;
	public static volatile SingularAttribute<Cliente, String> clienteEmail;
	public static volatile SingularAttribute<Cliente, String> clienteNome;
	public static volatile SingularAttribute<Cliente, LocalDate> clienteDataNascimento;

}

