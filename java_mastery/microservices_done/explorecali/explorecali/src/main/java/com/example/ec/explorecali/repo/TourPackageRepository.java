/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ec.explorecali.repo;

import com.example.ec.explorecali.domain.TourPackage;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 *
 * @author payal
 */
@RepositoryRestResource(collectionResourceRel = "packages", path="packages")
public interface TourPackageRepository extends CrudRepository<TourPackage,String>{

    @Override
    @RestResource(exported=false)
    public void deleteAll();

    @Override
    @RestResource(exported=false)
    public void deleteAll(Iterable<? extends TourPackage> entities);

    @Override
    @RestResource(exported=false)
    public void deleteAllById(Iterable<? extends String> ids);

    @Override
    @RestResource(exported=false)
    public void delete(TourPackage entity);

    @Override
    @RestResource(exported=false)
    public void deleteById(String id);

    @Override
    @RestResource(exported=false)
    public <S extends TourPackage> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    @RestResource(exported=false)
    public <S extends TourPackage> S save(S entity);
    Optional<TourPackage> findByName(String name);
    
}
