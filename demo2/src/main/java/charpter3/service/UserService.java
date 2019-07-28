package charpter3.service;

import charpter3.pojo.User2;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public  void printUser(User2 user){
        System.out.println("编号: " + user.getId());
        System.out.println("用户名称: " + user.getUserName());
        System.out.println("备注: " + user.getNote());
    }

}
