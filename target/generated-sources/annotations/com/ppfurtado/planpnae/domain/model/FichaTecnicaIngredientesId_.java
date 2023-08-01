package com.ppfurtado.planpnae.domain.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(FichaTecnicaIngredientesId.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class FichaTecnicaIngredientesId_ {

	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnicaIngredientesId#ingredienteId
	 **/
	public static volatile SingularAttribute<FichaTecnicaIngredientesId, Long> ingredienteId;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnicaIngredientesId#fichaTecnicaId
	 **/
	public static volatile SingularAttribute<FichaTecnicaIngredientesId, Long> fichaTecnicaId;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnicaIngredientesId
	 **/
	public static volatile EmbeddableType<FichaTecnicaIngredientesId> class_;

	public static final String INGREDIENTE_ID = "ingredienteId";
	public static final String FICHA_TECNICA_ID = "fichaTecnicaId";

}

