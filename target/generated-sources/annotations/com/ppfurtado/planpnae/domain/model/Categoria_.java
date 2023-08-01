package com.ppfurtado.planpnae.domain.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Categoria.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Categoria_ {

	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Categoria#nome
	 **/
	public static volatile SingularAttribute<Categoria, String> nome;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Categoria#id
	 **/
	public static volatile SingularAttribute<Categoria, Long> id;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Categoria
	 **/
	public static volatile EntityType<Categoria> class_;

	public static final String NOME = "nome";
	public static final String ID = "id";

}

