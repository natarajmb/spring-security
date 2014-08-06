<%--
  ~ Copyright (c) Cognitivenode 2014. All Rights Reserved.
  ~
  ~ No part of this source code or any of its contents may be reproduced, copied,
  ~ modified or adapted, without the prior written consent of the author,
  ~ unless otherwise indicated for stand-alone materials.
  --%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/home.do">Secure Vault</a></li>
            <sec:authorize access="isAnonymous()">
                <li class="right"><a href="https://localhost:8443/cas/login?service=http://localhost:8080/spring-security/secure/authenticated.do">Login</a></li>
            </sec:authorize>
            <sec:authorize access="hasAnyRole('ROLE_USER','ROLE_ADMIN')">
                <li class="right"><a href="${pageContext.request.contextPath}/j_spring_security_logout">Logout</a></li>
            </sec:authorize>
            <sec:authorize access="hasRole('ROLE_ADMIN')">
                <li class="right"><a href="${pageContext.request.contextPath}/secure/admin/admin.do">Admin</a></li>
            </sec:authorize>
        </ul>
    </nav>
</div>