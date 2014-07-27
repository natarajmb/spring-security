/*
 * Copyright (c) Cognitivenode 2014. All Rights Reserved.
 *
 * No part of this source code or any of its contents may be reproduced, copied,
 * modified or adapted, without the prior written consent of the author,
 * unless otherwise indicated for stand-alone materials.
 */

package com.cognitivenode.security.facade;

import com.cognitivenode.security.model.Authority;
import com.cognitivenode.security.model.User;
import com.cognitivenode.security.service.UserService;
import com.cognitivenode.security.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Comments about this class
 *
 * @author nataraj.basappa
 * @version 1.0, 27/07/2014
 */
@Component
public class CustomerService implements UserDetailsService {

    @Autowired
    private UserServiceImpl userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User foundUser = userService.findByName(username);
        final Set<Authority> authorities = foundUser.getAuthorities();

        final List<String> listOfAuthorities = new ArrayList<String>();
        for (Authority authority : authorities) {
            listOfAuthorities.add(authority.getName());
        }

        final List<GrantedAuthority> grantedAuthorities = AuthorityUtils.createAuthorityList((String[]) listOfAuthorities.toArray());
        return new org.springframework.security.core.userdetails.User(username, foundUser.getPassword(), grantedAuthorities);
    }
}
