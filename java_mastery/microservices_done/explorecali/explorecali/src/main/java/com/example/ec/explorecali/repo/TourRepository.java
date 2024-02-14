/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ec.explorecali.repo;

import com.example.ec.explorecali.domain.Tour;
import java.util.List;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 *
 * @author payal
 */
public interface TourRepository extends JpaRepository<Tour,Integer> {
    Page<Tour> findByTourPackageCode(String code,Pageable pageable);

    /*@Override
    @RestResource(exported=false)
    public <S extends Tour> List<S> findAll(Example<S> example, Sort sort);

    @Override
    @RestResource(exported=false)
    public <S extends Tour> List<S> findAll(Example<S> example);

    @Override
    @RestResource(exported=false)
    public Page<Tour> findAll(Pageable pageable);*/

    @Override
    @RestResource(exported=false)
    public <S extends Tour> List<S> saveAllAndFlush(Iterable<S> entities);

    @Override
    @RestResource(exported=false)
    public <S extends Tour> S saveAndFlush(S entity);

    @Override
    @RestResource(exported=false)
    public void deleteAll();

    @Override
    @RestResource(exported=false)
    public void deleteAll(Iterable<? extends Tour> entities);

    @Override
    @RestResource(exported=false)
    public void deleteAllById(Iterable<? extends Integer> ids);

    @Override
    @RestResource(exported=false)
    public void delete(Tour entity);

    @Override
    @RestResource(exported=false)
    public void deleteById(Integer id);

    @Override
    @RestResource(exported=false)
    public <S extends Tour> S save(S entity);
    
}
