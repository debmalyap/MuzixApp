package com.stackroute.MuzixApplication.repository;

import com.stackroute.MuzixApplication.domain.Muzix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Muzix,Integer>
{
    //CRUD operations present in JpaRespository//
}
