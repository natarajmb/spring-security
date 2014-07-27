/*
 * Copyright (c) Cognitivenode 2014. All Rights Reserved.
 *
 * No part of this source code or any of its contents may be reproduced, copied,
 * modified or adapted, without the prior written consent of the author,
 * unless otherwise indicated for stand-alone materials.
 */

package com.cognitivenode.security.service;

import com.cognitivenode.security.model.User;

/**
 * User service to receive user from database for spring security
 *
 * @author nataraj.basappa
 * @version 1.0, 27/07/2014
 */
public interface UserService {

    public User findByName(final String name);

    public User findById(final Long id);
}
