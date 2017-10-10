
package com.syntaxerror.ezz0034.repositories;

import com.syntaxerror.ezz0034.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User, Integer> {
    User findAccountByEmailAndMagic(String email, String magic);
}
