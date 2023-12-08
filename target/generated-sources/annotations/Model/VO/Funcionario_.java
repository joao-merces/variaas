package Model.VO;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Funcionario.class)
public abstract class Funcionario_ {

	public static volatile ListAttribute<Funcionario, Pedido> pedidoId;
	public static volatile SingularAttribute<Funcionario, Long> funcionarioId;
	public static volatile SingularAttribute<Funcionario, String> funcionarioNome;
	public static volatile SingularAttribute<Funcionario, Float> funcionarioSalario;
	public static volatile SingularAttribute<Funcionario, LocalDate> funcionarioDataNascimento;
	public static volatile SingularAttribute<Funcionario, String> funcionarioEmail;

}

