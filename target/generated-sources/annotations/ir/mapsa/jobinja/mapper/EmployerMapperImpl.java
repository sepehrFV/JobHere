package ir.mapsa.jobinja.mapper;

import ir.mapsa.jobinja.dto.EmployerDTO;
import ir.mapsa.jobinja.entities.Employer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-09T18:52:53+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class EmployerMapperImpl implements EmployerMapper {

    @Override
    public Employer toEntity(EmployerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Employer employer = new Employer();

        employer.setId( dto.getId() );
        employer.setCompanyName( dto.getCompanyName() );

        return employer;
    }

    @Override
    public EmployerDTO toDto(Employer entity) {
        if ( entity == null ) {
            return null;
        }

        EmployerDTO employerDTO = new EmployerDTO();

        employerDTO.setId( entity.getId() );
        employerDTO.setCompanyName( entity.getCompanyName() );

        return employerDTO;
    }

    @Override
    public List<Employer> toEntities(List<EmployerDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Employer> list = new ArrayList<Employer>( dtoList.size() );
        for ( EmployerDTO employerDTO : dtoList ) {
            list.add( toEntity( employerDTO ) );
        }

        return list;
    }

    @Override
    public List<EmployerDTO> toDtoes(List<Employer> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<EmployerDTO> list = new ArrayList<EmployerDTO>( entityList.size() );
        for ( Employer employer : entityList ) {
            list.add( toDto( employer ) );
        }

        return list;
    }

    @Override
    public void update(Employer entity, EmployerDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getCompanyName() != null ) {
            entity.setCompanyName( dto.getCompanyName() );
        }
    }
}
