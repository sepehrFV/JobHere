package ir.mapsa.jobinja.mapper;

import ir.mapsa.jobinja.dto.EmployerDTO;
import ir.mapsa.jobinja.entities.Employer;
import ir.mapsa.jobinja.generic.GenericMapper;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface EmployerMapper extends GenericMapper<Employer, EmployerDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void update(@MappingTarget Employer entity,EmployerDTO dto);

}
