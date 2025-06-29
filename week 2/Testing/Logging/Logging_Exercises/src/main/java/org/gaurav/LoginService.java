package org.gaurav;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginService {

    private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

    public void login(String username) {
        if (username == null || username.isEmpty()) {
            logger.error("Login failed: Username is empty");
        } else if (username.equalsIgnoreCase("admin")) {
            logger.warn("Admin user login attempt");
        } else {
            logger.info("User {} logged in", username);
        }
    }
}
