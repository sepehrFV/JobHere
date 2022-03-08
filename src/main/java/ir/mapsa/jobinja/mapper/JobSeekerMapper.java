package ir.mapsa.jobinja.mapper;

import ir.mapsa.jobinja.dto.JobSeekerDTO;
import ir.mapsa.jobinja.entities.JobSeeker;
import ir.mapsa.jobinja.generic.GenericMapper;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "Spring")
public interface JobSeekerMapper extends GenericMapper<JobSeeker, JobSeekerDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
    void update(@MappingTarget JobSeeker entity,JobSeekerDTO dto);
}
