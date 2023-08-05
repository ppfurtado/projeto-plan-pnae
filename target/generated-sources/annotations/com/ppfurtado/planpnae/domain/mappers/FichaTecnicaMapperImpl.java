package com.ppfurtado.planpnae.domain.mappers;

import com.ppfurtado.planpnae.domain.dtos.FichaTecnicaRequest;
import com.ppfurtado.planpnae.domain.model.FichaTecnica;
import com.ppfurtado.planpnae.domain.model.Ingredientes;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-05T00:22:01-0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class FichaTecnicaMapperImpl implements FichaTecnicaMapper {

    @Override
    public FichaTecnica toEntity(FichaTecnicaRequest fichaTecnicaRequest) {
        if ( fichaTecnicaRequest == null ) {
            return null;
        }

        FichaTecnica fichaTecnica = new FichaTecnica();

        fichaTecnica.setIngredientes( longListToIngredientesList( fichaTecnicaRequest.getIngredientes() ) );
        fichaTecnica.setModoPreparo( fichaTecnicaRequest.getModoPreparo() );

        return fichaTecnica;
    }

    @Override
    public FichaTecnicaRequest toRequest(FichaTecnica fichaTecnica) {
        if ( fichaTecnica == null ) {
            return null;
        }

        FichaTecnicaRequest fichaTecnicaRequest = new FichaTecnicaRequest();

        fichaTecnicaRequest.setMedidaCaseira( FichaTecnicaMapper.medidaCaseiraStringToDouble( fichaTecnica.getMedidaCaseira() ) );
        fichaTecnicaRequest.setIngredientes( ingredientesListToLongList( fichaTecnica.getIngredientes() ) );
        fichaTecnicaRequest.setPerCapitaLiquido( FichaTecnicaMapper.perCapitaLiquidoStringToDouble( fichaTecnica.getPerCapitaLiquido() ) );
        fichaTecnicaRequest.setCustoUnitario( FichaTecnicaMapper.custoUnitarioStringToDouble( fichaTecnica.getCustoUnitario() ) );
        fichaTecnicaRequest.setPerCapitaBruto( FichaTecnicaMapper.perCapitaBrutoStringToDouble( fichaTecnica.getPerCapitaBruto() ) );
        fichaTecnicaRequest.setModoPreparo( fichaTecnica.getModoPreparo() );

        return fichaTecnicaRequest;
    }

    protected List<Ingredientes> longListToIngredientesList(List<Long> list) {
        if ( list == null ) {
            return null;
        }

        List<Ingredientes> list1 = new ArrayList<Ingredientes>( list.size() );
        for ( Long long1 : list ) {
            list1.add( FichaTecnicaMapper.idToEntity( long1 ) );
        }

        return list1;
    }

    protected List<Long> ingredientesListToLongList(List<Ingredientes> list) {
        if ( list == null ) {
            return null;
        }

        List<Long> list1 = new ArrayList<Long>( list.size() );
        for ( Ingredientes ingredientes : list ) {
            list1.add( FichaTecnicaMapper.entityToId( ingredientes ) );
        }

        return list1;
    }
}
