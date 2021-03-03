package com.kolev.productshop.service;

import com.kolev.productshop.domain.models.service.OfferServiceModel;

import java.util.List;


public interface OfferService {

    List<OfferServiceModel> findAllOffers();
}
