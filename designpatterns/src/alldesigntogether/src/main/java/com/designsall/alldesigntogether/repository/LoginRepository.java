package com.designsall.alldesigntogether.repository;

import com.designsall.alldesigntogether.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<User, Long> {

    User findByLoginAndPasswd(String login, String passwd);

    User findByToken(String token);

}
