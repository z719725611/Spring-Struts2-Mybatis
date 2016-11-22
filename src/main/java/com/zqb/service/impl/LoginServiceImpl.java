package com.zqb.service.impl;

import com.zqb.bean.Login;
import com.zqb.service.BaseBiz;
import com.zqb.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/10/25 0025.
 */
@Service
public class LoginServiceImpl extends BaseBiz implements LoginService {
    public void getLoginName(Login login) {
        this.baseDao.update(login,"updateUser");
    }
}
