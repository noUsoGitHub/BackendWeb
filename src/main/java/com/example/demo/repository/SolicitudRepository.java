package com.example.demo.repository;

import com.example.demo.domain.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SolicitudRepository extends JpaRepository<Solicitud,Long>{

}
