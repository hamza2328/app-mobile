package com.example.intelligentstore.repository;

import com.example.intelligentstore.entity.Category;
import com.example.intelligentstore.entity.Fournisseur;
import com.example.intelligentstore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {

}
