/*
 * Copyright (c) Cognitivenode 2014. All Rights Reserved.
 *
 * No part of this source code or any of its contents may be reproduced, copied,
 * modified or adapted, without the prior written consent of the author,
 * unless otherwise indicated for stand-alone materials.
 */

package com.cognitivenode.security.model;

import javax.persistence.*;

/**
 * Entity class to represent spring security authorities
 *
 * @author nataraj.basappa
 * @version 1.0, 27/07/2014
 */
@Entity
@Table(name = "roles")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ROLE_ID")
    private Long Id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "ROLE")
    private String role;

    public Authority() {
        super();
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
