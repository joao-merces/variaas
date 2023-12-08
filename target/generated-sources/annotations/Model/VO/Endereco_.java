package Model.VO;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Endereco.class)
public abstract class Endereco_ {

	public static volatile SingularAttribute<Endereco, String> enderecoLogradouro;
	public static volatile SingularAttribute<Endereco, Integer> enderecoNumero;
	public static volatile SingularAttribute<Endereco, String> enderecoCEP;
	public static volatile SingularAttribute<Endereco, String> enderecoComplemento;
	public static volatile SingularAttribute<Endereco, String> enderecoBairro;
	public static volatile SingularAttribute<Endereco, String> enderecoCidade;
	public static volatile SingularAttribute<Endereco, String> enderecoEstado;

}

