package ir.mapsa.jobinja.mapper;

import ir.mapsa.jobinja.dto.JobSeekerDTO;
import ir.mapsa.jobinja.entities.JobSeeker;
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
public class JobSeekerMapperImpl implements JobSeekerMapper {

    @Override
    public JobSeeker toEntity(JobSeekerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        JobSeeker jobSeeker = new JobSeeker();

        jobSeeker.setId( dto.getId() );
        jobSeeker.setName( dto.getName() );
        jobSeeker.setFamily( dto.getFamily() );
        jobSeeker.setAge( dto.getAge() );
        jobSeeker.setMarried( dto.isMarried() );
        jobSeeker.setMainSkill( dto.getMainSkill() );
        jobSeeker.setCv( dto.getCv() );

        return jobSeeker;
    }

    @Override
    public JobSeekerDTO toDto(JobSeeker entity) {
        if ( entity == null ) {
            return null;
        }

        JobSeekerDTO jobSeekerDTO = new JobSeekerDTO();

        jobSeekerDTO.setId( entity.getId() );
        jobSeekerDTO.setName( entity.getName() );
        jobSeekerDTO.setFamily( entity.getFamily() );
        jobSeekerDTO.setMainSkill( entity.getMainSkill() );
        jobSeekerDTO.setMarried( entity.isMarried() );
        jobSeekerDTO.setAge( entity.getAge() );
        jobSeekerDTO.setCv( entity.getCv() );

        return jobSeekerDTO;
    }

    @Override
    public List<JobSeeker> toEntities(List<JobSeekerDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<JobSeeker> list = new ArrayList<JobSeeker>( dtoList.size() );
        for ( JobSeekerDTO jobSeekerDTO : dtoList ) {
            list.add( toEntity( jobSeekerDTO ) );
        }

        return list;
    }

    @Override
    public List<JobSeekerDTO> toDtoes(List<JobSeeker> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<JobSeekerDTO> list = new ArrayList<JobSeekerDTO>( entityList.size() );
        for ( JobSeeker jobSeeker : entityList ) {
            list.add( toDto( jobSeeker ) );
        }

        return list;
    }

    @Override
    public void update(JobSeeker entity, JobSeekerDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
        if ( dto.getFamily() != null ) {
            entity.setFamily( dto.getFamily() );
        }
        if ( dto.getAge() != null ) {
            entity.setAge( dto.getAge() );
        }
        entity.setMarried( dto.isMarried() );
        if ( dto.getMainSkill() != null ) {
            entity.setMainSkill( dto.getMainSkill() );
        }
        if ( dto.getCv() != null ) {
            entity.setCv( dto.getCv() );
        }
    }
}
