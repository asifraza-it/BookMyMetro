package com.upmrc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upmrc.domain.StationDetail;


@Repository
public interface StationRepository extends JpaRepository<StationDetail, Integer> {

}
