/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ec.explorecali.service;

import com.example.ec.explorecali.domain.TourPackage;
import com.example.ec.explorecali.repo.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    /**
     * Create a Tour Package
     *
     * @param code code of the package
     * @param name name of the package
     *
     * @return new or existing tour package
     */
    public TourPackage createTourPackage(String code, String name) {
        return tourPackageRepository.findById(code)
                .orElse(tourPackageRepository.save(new TourPackage(code, name)));
    }

    /**
     * Lookup All Tour packages
     *
     * @return all tour packages
     */
    public Iterable<TourPackage> lookup(){
        return tourPackageRepository.findAll();
    }

    public long total() {
        return tourPackageRepository.count();
    }
}
