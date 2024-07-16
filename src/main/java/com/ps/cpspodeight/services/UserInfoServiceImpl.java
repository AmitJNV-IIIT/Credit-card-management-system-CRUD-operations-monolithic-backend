package com.ps.cpspodeight.services;

import com.ps.cpspodeight.dao.UserInfoDao;
import com.ps.cpspodeight.dao.UsersDao;
import com.ps.cpspodeight.entities.UserInfo;
import com.ps.cpspodeight.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private UsersDao usersDao;

    @Override
    public Optional<UserInfo> getUserDetailsByUserId(int userId) {

        return this.userInfoDao.findById(userId);

    }

    @Override
    public UserInfo getUserDetailsByUsername(String username) {

        return null;
    }

    @Override
    public UserInfo addNewUser(UserInfo userInfo) {
        return this.userInfoDao.save(userInfo);
    }

    @Override
    public boolean deleteUserByUserId(int userId) {

        Optional<UserInfo> userInfo = this.userInfoDao.findById(userId);
        if(userInfo.isEmpty())
            return false;

        this.userInfoDao.deleteById(userId);
        return true;
    }

    @Override
    public UserInfo updateUserInfoByUserId(int userId, UserInfo userInfo) {
        Optional<UserInfo> userInfo1 = this.userInfoDao.findById(userId);

        if(userInfo1.isEmpty()){
            return null;
        }
        return this.userInfoDao.save(userInfo);
    }

    @Override
    public boolean updatePasswordByUserId(int userId) {

        Optional<Users> user = this.usersDao.findById(userId);
        if(user.isEmpty())
            return false;

        user.get().setPassword("Password$1111");
        return true;
    }

    @Override
    public boolean updateUsernameByUserId(int userId) {
        Optional<Users> user = this.usersDao.findById(userId);
        if(user.isEmpty())
            return false;

        user.get().setUserName("user123");
        return true;
    }
}
