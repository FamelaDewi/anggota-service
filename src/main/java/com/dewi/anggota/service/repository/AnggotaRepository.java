/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dewi.anggota.service.repository;

import com.dewi.anggota.service.entity.Anggota;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author HP
 */
@Repository
public interface AnggotaRepository extends JpaRepository<Anggota, Long> {
    
    public Anggota findByAnggotaId(Long anggotaId);


}

    

