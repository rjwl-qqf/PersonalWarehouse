package com.gupaoedu.dubbo.server;

public class LoginServiceImpl implements ILoginService {
    @Override
    public String login(String userName, String password) {
        //业务逻辑
        if(userName.equals("admin")&&password.equals("admin")){
            return "SUCCESS";
        }
        return "FAILED";
    }
}
