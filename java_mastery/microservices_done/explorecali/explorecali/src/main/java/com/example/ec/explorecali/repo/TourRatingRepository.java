/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ec.explorecali.repo;

import com.example.ec.explorecali.domain.TourRating;
import com.example.ec.explorecali.domain.TourRatingPk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Tour Rating Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
@RepositoryRestResource(exported=false)
public interface TourRatingRepository extends CrudRepository<TourRating, TourRatingPk> {

    /**
     * Lookup all the TourRatings for a tour.
     *
     * @param tourId is the tour Identifier
     * @return a List of any found TourRatings
     */
    List<TourRating> findByPkTourId(Integer tourId);

    /**
     * Lookup a TourRating by the TourId and Customer Id
     * @param tourId tour identifier
     * @param customerId customer identifier
     * @return Optional of found TourRatings.
     */
    Optional<TourRating> findByPkTourIdAndPkCustomerId(Integer tourId, Integer customerId);
    
    /**
     * Fetch a Page of TourRatings
     *
     * @param tourId the tour identifier
     * @param pageable info to determine page
     * @return Page of Tour Ratings
     */
    Page<TourRating> findByPkTourId(Integer tourId, Pageable pageable);
}