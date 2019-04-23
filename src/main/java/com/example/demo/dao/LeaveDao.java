package com.example.demo.dao;

import com.example.demo.entity.LeaveInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveDao extends JpaRepository<LeaveInfo, Integer> {
    LeaveInfo getById(String businessKey);
}
