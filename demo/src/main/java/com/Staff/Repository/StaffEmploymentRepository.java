package com.Staff.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Staff.Model.StaffEmployement;

@Repository
public interface StaffEmploymentRepository extends JpaRepository<StaffEmployement,String>{



}
