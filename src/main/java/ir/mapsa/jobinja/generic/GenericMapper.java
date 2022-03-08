package ir.mapsa.jobinja.generic;

import org.mapstruct.Mapper;

import java.util.List;


public interface GenericMapper<E,D> {

    E toEntity(D dto);
    D toDto(E entity);
    List<E> toEntities(List<D> dtoList);
    List<D> toDtoes(List<E> entityList);

}
