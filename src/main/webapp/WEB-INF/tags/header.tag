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
            <li><a href="${pageContext.request.contextPath}/homepage.do">Secure Vault</a></li>
            <sec:authorize access="isAnonymous()">
                <li class="right"><a href="${pageContext.request.contextPath}/loginpage.do">Login</a></li>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
                <li class="right"><a href="${pageContext.request.contextPath}/logoutpage.do">Logout</a></li>
            </sec:authorize>
        </ul>
    </nav>
</div>