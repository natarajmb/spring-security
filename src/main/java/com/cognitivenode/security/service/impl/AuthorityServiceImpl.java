/*
 * Copyright (c) Cognitivenode 2014. All Rights Reserved.
 *
 * No part of this source code or any of its contents may be reproduced, copied,
 * modified or adapted, without the prior written consent of the author,
 * unless otherwise indicated for stand-alone materials.
 */

package com.cognitivenode.security.service.impl;

import com.cognitivenode.security.dao.AuthorityJpaDAO;
import com.cognitivenode.security.model.Authority;
import com.cognitivenode.security.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Comments about this class
 *
 * @author nataraj.basappa
 * @version 1.0, 27/07/2014
 */
@Transactional
@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    AuthorityJpaDAO dao;

    @Override
    public Authority findByName(String name) {
        return dao.findByName(name);
    }

    @Override
    public Authority findById(Long id) {
        return dao.findOne(id);
    }
}
