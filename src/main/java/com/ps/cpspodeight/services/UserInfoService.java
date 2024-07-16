package com.ps.cpspodeight.services;

import com.ps.cpspodeight.entities.UserInfo;

import java.util.Optional;

public interface UserInfoService {
//    public List<UserInfo> getAllUserInfoByAdminId(int adminId);
    public Optional<UserInfo> getUserDetailsByUserId(int userId);
    public UserInfo getUserDetailsByUsername(String username);
    public UserInfo addNewUser(UserInfo userInfo);
//    public boolean deleteUserByAdminId(int adminId);
    public boolean deleteUserByUserId(int userId);
    public UserInfo updateUserInfoByUserId(int userId,UserInfo userInfo);
    public boolean updatePasswordByUserId(int userId);
    public boolean updateUsernameByUserId(int userId);
}
