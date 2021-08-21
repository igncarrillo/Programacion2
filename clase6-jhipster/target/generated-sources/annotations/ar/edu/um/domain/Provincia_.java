package ar.edu.um.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Provincia.class)
public abstract class Provincia_ {

	public static volatile SingularAttribute<Provincia, String> zipcode;
	public static volatile SingularAttribute<Provincia, Long> id;
	public static volatile SingularAttribute<Provincia, String> nombre;
	public static volatile SingularAttribute<Provincia, Pais> pais;

	public static final String ZIPCODE = "zipcode";
	public static final String ID = "id";
	public static final String NOMBRE = "nombre";
	public static final String PAIS = "pais";

}

