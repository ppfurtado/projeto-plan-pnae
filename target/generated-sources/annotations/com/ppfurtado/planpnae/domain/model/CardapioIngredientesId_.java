package com.ppfurtado.planpnae.domain.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(CardapioIngredientesId.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class CardapioIngredientesId_ {

	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.CardapioIngredientesId#ingredienteID
	 **/
	public static volatile SingularAttribute<CardapioIngredientesId, Long> ingredienteID;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.CardapioIngredientesId#cardapioId
	 **/
	public static volatile SingularAttribute<CardapioIngredientesId, Long> cardapioId;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.CardapioIngredientesId
	 **/
	public static volatile EmbeddableType<CardapioIngredientesId> class_;

	public static final String INGREDIENTE_ID = "ingredienteID";
	public static final String CARDAPIO_ID = "cardapioId";

}

