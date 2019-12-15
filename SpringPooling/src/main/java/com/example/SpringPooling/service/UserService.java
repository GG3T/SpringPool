package com.example.SpringPooling.service;

import com.example.SpringPooling.dao.UserDao;
import com.example.SpringPooling.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class UserService {
    @Autowired
    private UserDao dao;

    Logger log = LoggerFactory.getLogger(UserService.class);

    @Scheduled(fixedRate = 5000)
    public void add2DBJob() {
        User user = new User();
        user.setName("User" + new Random().nextInt(374483));
        dao.save(user);
        System.out.println("Adicionando Serviço na chamada :" + new Date().toString());
    }

    @Scheduled(cron = "0/15 * * * * *")
    public void fetchDBjob() {
        List<User> users = dao.findAll();
        System.out.println("Buscando a chamada no Service: +--" + new Date().toString());
        System.out.println("numero de registro gravado : " + users.size());
        log.info("Usuarios : {}", users);

    }
}
