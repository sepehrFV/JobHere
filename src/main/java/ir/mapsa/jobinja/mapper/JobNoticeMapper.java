package ir.mapsa.jobinja.mapper;

import ir.mapsa.jobinja.dto.JobNoticeDTO;
import ir.mapsa.jobinja.entities.JobNotice;
import ir.mapsa.jobinja.generic.GenericMapper;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface JobNoticeMapper extends GenericMapper<JobNotice,JobNoticeDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void update(@MappingTarget JobNotice entity,JobNoticeDTO dto);
}
