package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.*;

@Repository
public interface OfferDao extends JpaRepository<Offer, Integer>{

}
