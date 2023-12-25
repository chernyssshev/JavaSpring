package ru.chernyssshev.skillbox.app.services;

import org.apache.log4j.Logger;
import ru.chernyssshev.skillbox.web.dto.LoginForm;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private Logger logger = Logger.getLogger(LoginService.class);

    public boolean authenticate(LoginForm loginFrom) {
        logger.info("try auth with user-form: " + loginFrom);
        return loginFrom.getUsername().equals("admin") && loginFrom.getPassword().equals("11547");
    }
}
