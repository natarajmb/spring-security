/*
 * Copyright (c) Cognitivenode 2014. All Rights Reserved.
 *
 * No part of this source code or any of its contents may be reproduced, copied,
 * modified or adapted, without the prior written consent of the author,
 * unless otherwise indicated for stand-alone materials.
 */

package com.cognitivenode.security.service;

import com.cognitivenode.security.model.Authority;

/**
 * Spring security authority service
 *
 * @author nataraj.basappa
 * @version 1.0, 27/07/2014
 */
public interface AuthorityService {

    public Authority findByName(final String name);

    public Authority findById(final Long id);
}
