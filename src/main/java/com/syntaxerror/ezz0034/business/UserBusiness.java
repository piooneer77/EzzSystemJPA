
package com.syntaxerror.ezz0034.business;

import com.syntaxerror.ezz0034.models.User;
import com.syntaxerror.ezz0034.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserBusiness {
    
    @Autowired
    private UserRepository userRepository;

    public User findUserByIdAndMagic(String user, String magic) {
       return userRepository.findUserByUserAndMagic(user, magic);
    }
    
}
