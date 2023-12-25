package org.example.app.services;

import org.apache.log4j.Logger;
import org.example.web.dto.LoginForm;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private Logger logger = Logger.getLogger(LoginService.class);

    public boolean authenticate(LoginForm loginFrom) {
        logger.info("auth with user-form: " + loginFrom);
        return loginFrom.getUsername().equals("admin") && loginFrom.getPassword().equals("1547");
    }

}
