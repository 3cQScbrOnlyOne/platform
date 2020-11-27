package com.platform.service.shop.impl;

import com.platform.dao.shop.UserRecordDao;
import com.platform.entity.shop.UserRecordEntity;
import com.platform.service.shop.UserRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by zhouhaisheng on 2019/3/2.
 */
@Service
public class UserRecordServiceImpl implements UserRecordService {

    @Autowired
    private UserRecordDao userRecordDao;



    @Override
    public List<UserRecordEntity> queryList(Map<String, Object> map) {
        return userRecordDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return userRecordDao.queryTotal(map);
    }
}
