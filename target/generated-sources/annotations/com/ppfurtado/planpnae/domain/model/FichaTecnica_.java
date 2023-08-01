package com.ppfurtado.planpnae.domain.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(FichaTecnica.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class FichaTecnica_ {

	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnica#fatorDeCorrecao
	 **/
	public static volatile SingularAttribute<FichaTecnica, String> fatorDeCorrecao;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnica#medidaCaseira
	 **/
	public static volatile SingularAttribute<FichaTecnica, String> medidaCaseira;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnica#ingredientes
	 **/
	public static volatile ListAttribute<FichaTecnica, Ingredientes> ingredientes;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnica#ultimaAtualizacao
	 **/
	public static volatile SingularAttribute<FichaTecnica, String> ultimaAtualizacao;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnica#perCapitaLiquido
	 **/
	public static volatile SingularAttribute<FichaTecnica, String> perCapitaLiquido;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnica#composicaoAlimento
	 **/
	public static volatile SingularAttribute<FichaTecnica, ComposicaoAlimento> composicaoAlimento;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnica#fatorDeCoccao
	 **/
	public static volatile SingularAttribute<FichaTecnica, String> fatorDeCoccao;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnica#custoUnitario
	 **/
	public static volatile SingularAttribute<FichaTecnica, String> custoUnitario;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnica#modoPreparo
	 **/
	public static volatile SingularAttribute<FichaTecnica, String> modoPreparo;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnica#criado
	 **/
	public static volatile SingularAttribute<FichaTecnica, String> criado;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnica#id
	 **/
	public static volatile SingularAttribute<FichaTecnica, Long> id;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnica
	 **/
	public static volatile EntityType<FichaTecnica> class_;
	
	/**
	 * @see com.ppfurtado.planpnae.domain.model.FichaTecnica#perCapitaBruto
	 **/
	public static volatile SingularAttribute<FichaTecnica, String> perCapitaBruto;

	public static final String FATOR_DE_CORRECAO = "fatorDeCorrecao";
	public static final String MEDIDA_CASEIRA = "medidaCaseira";
	public static final String INGREDIENTES = "ingredientes";
	public static final String ULTIMA_ATUALIZACAO = "ultimaAtualizacao";
	public static final String PER_CAPITA_LIQUIDO = "perCapitaLiquido";
	public static final String COMPOSICAO_ALIMENTO = "composicaoAlimento";
	public static final String FATOR_DE_COCCAO = "fatorDeCoccao";
	public static final String CUSTO_UNITARIO = "custoUnitario";
	public static final String MODO_PREPARO = "modoPreparo";
	public static final String CRIADO = "criado";
	public static final String ID = "id";
	public static final String PER_CAPITA_BRUTO = "perCapitaBruto";

}

