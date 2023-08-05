package com.ppfurtado.planpnae.domain.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Unidades.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Unidades_ {

	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Unidades#nomeInfoods
	 **/
	public static volatile SingularAttribute<Unidades, String> nomeInfoods;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Unidades#unidade
	 **/
	public static volatile SingularAttribute<Unidades, String> unidade;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Unidades#nomeSistematico
	 **/
	public static volatile SingularAttribute<Unidades, String> nomeSistematico;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Unidades#id
	 **/
	public static volatile SingularAttribute<Unidades, Long> id;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Unidades#nomePortugues
	 **/
	public static volatile SingularAttribute<Unidades, String> nomePortugues;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Unidades
	 **/
	public static volatile EntityType<Unidades> class_;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Unidades#nomeCampo
	 **/
	public static volatile SingularAttribute<Unidades, String> nomeCampo;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Unidades#nomeComum
	 **/
	public static volatile SingularAttribute<Unidades, String> nomeComum;

	public static final String NOME_INFOODS = "nomeInfoods";
	public static final String UNIDADE = "unidade";
	public static final String NOME_SISTEMATICO = "nomeSistematico";
	public static final String ID = "id";
	public static final String NOME_PORTUGUES = "nomePortugues";
	public static final String NOME_CAMPO = "nomeCampo";
	public static final String NOME_COMUM = "nomeComum";

}

