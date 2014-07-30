/*
 * Copyright (c) Cognitivenode 2014. All Rights Reserved.
 *
 * No part of this source code or any of its contents may be reproduced, copied,
 * modified or adapted, without the prior written consent of the author,
 * unless otherwise indicated for stand-alone materials.
 */

package com.cognitivenode.security.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Entity class to represent spring security user
 *
 * @author nataraj.basappa
 * @version 1.0, 27/07/2014
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "USERNAME", unique = true, nullable = false)
    private String username;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles",
            joinColumns = {@JoinColumn(name = "USERNAME", referencedColumnName = "USERNAME")},
            inverseJoinColumns = {@JoinColumn(name = "USER_ROLE_ID", referencedColumnName = "USER_ROLE_ID")}
    )
    private Set<Authority> authorities;

    @Column(name = "ENABLED", nullable = false)
    private boolean enabled = true;

    public User() {
        super();
    }

    public User(String username, String password, Set<Authority> authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
