package com.transwrap.test;

import com.transwarp.dao.AccountDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {
    @Test
    public void accountTest(){
        // 得到spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 从容器中获取AccountDao对象
        AccountDao accountDao = ac.getBean(AccountDao.class);
        // 调用方法
        accountDao.findAll();
    }
}
