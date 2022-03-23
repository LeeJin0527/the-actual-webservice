package com.zinzun.book.springboot.service.config.auth.dto;

import com.zinzun.book.springboot.web.domain.user.User;
import lombok.Getter;
import org.springframework.security.oauth2.client.web.server.UnAuthenticatedServerOAuth2AuthorizedClientRepository;

import java.io.Serializable;
@Getter
public class SessionUser  implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();

    }
}
