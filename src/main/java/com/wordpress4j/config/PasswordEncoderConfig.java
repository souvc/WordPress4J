package com.wordpress4j.config;

import com.github.wolf480pl.phpass.PHPass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *  适配WordPress加密器
 * @author souvc
 */
@Configuration
public class PasswordEncoderConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {

        return new PasswordEncoder() {

            PHPass phpass = new PHPass(8);

            @Override
            public String encode(CharSequence rawPassword) {
                String hashed = phpass.HashPassword(rawPassword.toString());
                return hashed;
            }

            /**
             * @param rawPassword 需要按照算法加密的密码
             * @param encodedPassword  需要比较的密码
             */
            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                boolean check = phpass.CheckPassword(rawPassword.toString(), encodedPassword);
                return check;
            }
        };
    }
}
