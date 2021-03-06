package com.cognitivenode.security.repository;

import com.cognitivenode.security.model.RememberMeToken;
import com.cognitivenode.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * DAO for spring security remember me token objects
 * <p/>
 * Note: Not required to implement the interface as it auto generated by spring data
 *
 * @author nataraj.basappa
 * @version 1.0,  29/07/2014.
 */

public interface RememberMeTokenRepository extends JpaRepository<RememberMeToken, String>, JpaSpecificationExecutor<RememberMeToken> {

    RememberMeToken findBySeries(String series);

    RememberMeToken findByUser(User user);
}
