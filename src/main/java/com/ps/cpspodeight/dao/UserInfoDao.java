package com.ps.cpspodeight.dao;

import com.ps.cpspodeight.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserInfoDao extends JpaRepository<UserInfo, Integer>{

}
