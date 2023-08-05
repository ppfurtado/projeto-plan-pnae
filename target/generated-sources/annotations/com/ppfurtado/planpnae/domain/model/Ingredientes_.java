package com.ppfurtado.planpnae.domain.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Ingredientes.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Ingredientes_ {

	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Ingredientes#nome
	 **/
	public static volatile SingularAttribute<Ingredientes, String> nome;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Ingredientes#id
	 **/
	public static volatile SingularAttribute<Ingredientes, Long> id;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Ingredientes#fichaTecnicas
	 **/
	public static volatile ListAttribute<Ingredientes, FichaTecnica> fichaTecnicas;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Ingredientes
	 **/
	public static volatile EntityType<Ingredientes> class_;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Ingredientes#categoriaId
	 **/
	public static volatile SingularAttribute<Ingredientes, Categoria> categoriaId;

	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String FICHA_TECNICAS = "fichaTecnicas";
	public static final String CATEGORIA_ID = "categoriaId";

}

