package Model.VO;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Livro.class)
public abstract class Livro_ {

	public static volatile SingularAttribute<Livro, LocalDate> livroPublicacao;
	public static volatile SingularAttribute<Livro, String> livroGenero;
	public static volatile SingularAttribute<Livro, String> imageSource;
	public static volatile SingularAttribute<Livro, Long> livroId;
	public static volatile SingularAttribute<Livro, Integer> livroEstoque;
	public static volatile ListAttribute<Livro, Livros_Pedidos> livrosPedidosId;
	public static volatile SingularAttribute<Livro, String> livroTitulo;
	public static volatile SingularAttribute<Livro, Float> livroPreco;
	public static volatile SingularAttribute<Livro, String> livroAutor;

}

