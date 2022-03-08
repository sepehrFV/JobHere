package ir.mapsa.jobinja.mapper;

import ir.mapsa.jobinja.dto.ReservedListDTO;
import ir.mapsa.jobinja.entities.ReservedList;
import ir.mapsa.jobinja.entities.ReservedList.ReservedListBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-04T11:52:07+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class ReservedListMapperImpl implements ReservedListMapper {

    @Override
    public ReservedList toEntity(ReservedListDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ReservedListBuilder reservedList = ReservedList.builder();

        return reservedList.build();
    }

    @Override
    public ReservedListDTO toDto(ReservedList entity) {
        if ( entity == null ) {
            return null;
        }

        ReservedListDTO reservedListDTO = new ReservedListDTO();

        reservedListDTO.setId( entity.getId() );

        return reservedListDTO;
    }

    @Override
    public List<ReservedList> toEntities(List<ReservedListDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ReservedList> list = new ArrayList<ReservedList>( dtoList.size() );
        for ( ReservedListDTO reservedListDTO : dtoList ) {
            list.add( toEntity( reservedListDTO ) );
        }

        return list;
    }

    @Override
    public List<ReservedListDTO> toDtoes(List<ReservedList> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ReservedListDTO> list = new ArrayList<ReservedListDTO>( entityList.size() );
        for ( ReservedList reservedList : entityList ) {
            list.add( toDto( reservedList ) );
        }

        return list;
    }

    @Override
    public void update(ReservedList entity, ReservedListDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
    }
}
