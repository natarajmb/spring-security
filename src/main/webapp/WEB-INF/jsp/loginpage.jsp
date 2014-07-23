<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  ~ Copyright (c) Cognitivenode 2014. All Rights Reserved.
  ~
  ~ No part of this source code or any of its contents may be reproduced, copied,
  ~ modified or adapted, without the prior written consent of the author,
  ~ unless otherwise indicated for stand-alone materials.
  --%>
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui.js"></script>
    <link href="${pageContext.request.contextPath}/css/jquery-ui.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/securevault.css" rel="stylesheet"/>
</head>
<body>
<%@include file="../tags/header.tag" %>
<form action="${pageContext.request.contextPath}/j_spring_security_check" method="POST">
    <div>
        <table class="center">
            <tr>
                <td colspan="2">
                    <div class="ui-widget hide">
                        <div class="ui-state-highlight ui-corner-all"
                             style="font-family: Helvetica, sans-serif; font-size: .7em; padding: 0 .7em;">
                            <p><span class="ui-icon ui-icon-info" style="float: left; margin-right: .3em;"></span>
                                Please fill both username and password.</p>
                        </div>
                    </div>
                    <div class="ui-widget hide">
                        <div class="ui-state-error ui-corner-all"
                             style="font-family: Helvetica, sans-serif; font-size: .7em; padding: 0 .7em;">
                            <p><span class="ui-icon ui-icon-alert" style="float: left; margin-right: .3em;"></span>
                                <strong>Alert:</strong> Sample ui-state-error style.</p>
                        </div>
                    </div>
                </td>
            </tr>
            <tr>
                <td><label>Username</label></td>
                <td><input type="text" name="j_username"/></td>
            </tr>
            <tr>
                <td><label>Password</label></td>
                <td><input type="password" name="j_password"/></td>
            </tr>
            <tr>
                <td></td>
                <td text-align="center">
                    <input type="submit" value="Submit" class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only button"/>
                </td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>
