package com.cognitivenode.security.repository.impl;

import com.cognitivenode.security.model.RememberMeToken;
import com.cognitivenode.security.model.User;
import com.cognitivenode.security.repository.RememberMeTokenRepository;
import com.cognitivenode.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import java.util.Date;

/**
 * JPA integration for spring security remember me functionality
 * <p/>
 * Note: This class is called to handle token persistence, this could be replaced
 *       with any other backend i.e. MongoDB and others
 *
 * @author nataraj.basappa
 * @version 1.0, 29/07/2014.
 */
public class RememberMeTokenRepositoryImpl implements PersistentTokenRepository {

    @Autowired
    RememberMeTokenRepository tokenRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void createNewToken(PersistentRememberMeToken persistentRememberMeToken) {
        RememberMeToken rememberMeToken = new RememberMeToken();
        User user = userRepository.findByUsername(persistentRememberMeToken.getUsername());
        rememberMeToken.setSeries(persistentRememberMeToken.getSeries());
        rememberMeToken.setUser(user);
        rememberMeToken.setToken(persistentRememberMeToken.getTokenValue());
        rememberMeToken.setLastUsed(persistentRememberMeToken.getDate());
        tokenRepository.save(rememberMeToken);
    }

    @Override
    public void updateToken(String series, String tokenValue, Date lastUsed) {
        RememberMeToken rememberMeToken = tokenRepository.findBySeries(series);
        rememberMeToken.setToken(tokenValue);
        rememberMeToken.setLastUsed(new Date());
        tokenRepository.save(rememberMeToken);
    }

    @Override
    public PersistentRememberMeToken getTokenForSeries(String series) {
        RememberMeToken rememberMeToken = tokenRepository.findBySeries(series);
        return new PersistentRememberMeToken(rememberMeToken.getUser().getUsername(), rememberMeToken.getSeries(), rememberMeToken.getToken(), rememberMeToken.getLastUsed());
    }

    @Override
    public void removeUserTokens(String username) {
        User user = userRepository.findByUsername(username);
        RememberMeToken rememberMeToken = tokenRepository.findByUser(user);
        if (rememberMeToken != null) {
            tokenRepository.delete(rememberMeToken);
        }
    }
}
