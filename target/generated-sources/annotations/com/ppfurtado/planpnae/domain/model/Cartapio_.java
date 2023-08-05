package com.ppfurtado.planpnae.domain.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;
import java.util.Map;

@StaticMetamodel(Cartapio.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Cartapio_ {

	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Cartapio#ingredientes
	 **/
	public static volatile ListAttribute<Cartapio, Ingredientes> ingredientes;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Cartapio#criada
	 **/
	public static volatile SingularAttribute<Cartapio, Date> criada;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Cartapio#ultimaAtualizacao
	 **/
	public static volatile SingularAttribute<Cartapio, Date> ultimaAtualizacao;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Cartapio#refeicaooHorario
	 **/
	public static volatile SingularAttribute<Cartapio, Map<String,String>> refeicaooHorario;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Cartapio#id
	 **/
	public static volatile SingularAttribute<Cartapio, Long> id;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Cartapio
	 **/
	public static volatile EntityType<Cartapio> class_;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.Cartapio#quantidade
	 **/
	public static volatile SingularAttribute<Cartapio, Double> quantidade;

	public static final String INGREDIENTES = "ingredientes";
	public static final String CRIADA = "criada";
	public static final String ULTIMA_ATUALIZACAO = "ultimaAtualizacao";
	public static final String REFEICAOO_HORARIO = "refeicaooHorario";
	public static final String ID = "id";
	public static final String QUANTIDADE = "quantidade";

}

