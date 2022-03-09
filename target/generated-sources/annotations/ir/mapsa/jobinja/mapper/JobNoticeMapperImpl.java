package ir.mapsa.jobinja.mapper;

import ir.mapsa.jobinja.dto.JobNoticeDTO;
import ir.mapsa.jobinja.entities.JobNotice;
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
public class JobNoticeMapperImpl implements JobNoticeMapper {

    @Override
    public JobNotice toEntity(JobNoticeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        JobNotice jobNotice = new JobNotice();

        jobNotice.setId( dto.getId() );
        jobNotice.setTitle( dto.getTitle() );
        jobNotice.setSkill( dto.getSkill() );
        jobNotice.setSalaryAmount( dto.getSalaryAmount() );
        jobNotice.setFullExplanation( dto.getFullExplanation() );

        return jobNotice;
    }

    @Override
    public JobNoticeDTO toDto(JobNotice entity) {
        if ( entity == null ) {
            return null;
        }

        JobNoticeDTO jobNoticeDTO = new JobNoticeDTO();

        jobNoticeDTO.setId( entity.getId() );
        jobNoticeDTO.setTitle( entity.getTitle() );
        jobNoticeDTO.setSalaryAmount( entity.getSalaryAmount() );
        jobNoticeDTO.setFullExplanation( entity.getFullExplanation() );
        jobNoticeDTO.setSkill( entity.getSkill() );

        return jobNoticeDTO;
    }

    @Override
    public List<JobNotice> toEntities(List<JobNoticeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<JobNotice> list = new ArrayList<JobNotice>( dtoList.size() );
        for ( JobNoticeDTO jobNoticeDTO : dtoList ) {
            list.add( toEntity( jobNoticeDTO ) );
        }

        return list;
    }

    @Override
    public List<JobNoticeDTO> toDtoes(List<JobNotice> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<JobNoticeDTO> list = new ArrayList<JobNoticeDTO>( entityList.size() );
        for ( JobNotice jobNotice : entityList ) {
            list.add( toDto( jobNotice ) );
        }

        return list;
    }

    @Override
    public void update(JobNotice entity, JobNoticeDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getTitle() != null ) {
            entity.setTitle( dto.getTitle() );
        }
        if ( dto.getSkill() != null ) {
            entity.setSkill( dto.getSkill() );
        }
        if ( dto.getSalaryAmount() != null ) {
            entity.setSalaryAmount( dto.getSalaryAmount() );
        }
        if ( dto.getFullExplanation() != null ) {
            entity.setFullExplanation( dto.getFullExplanation() );
        }
    }
}
