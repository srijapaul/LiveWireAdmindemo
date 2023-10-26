package com.LiveWires.LiveWireAdmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LiveWires.LiveWireAdmin.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

}
