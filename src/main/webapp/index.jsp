<%--
  ~ Copyright (c) Cognitivenode 2014. All Rights Reserved.
  ~
  ~ No part of this source code or any of its contents may be reproduced, copied,
  ~ modified or adapted, without the prior written consent of the author,
  ~ unless otherwise indicated for stand-alone materials.
  --%>

<html>
<head>
    <script type="text/javascript" src="js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="js/jquery-ui.js"></script>
    <link href="css/jquery-ui.css" rel="stylesheet"/>
    <style>
        .hide {
            visibility: hidden;
        }
        .show {
            visibility: visible;
        }
    </style>
</head>
<body>
<h2>Secure Vault</h2>

<div>
    <label>Username</label><input type="text" id="j_username"/>
    <label>Password</label><input type="password" id="j_password"/>
    <button type="submit" class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" role="button">
        <span class="ui-button-text">Submit</span>
    </button>
</div>

<div class="ui-widget hide">
    <div class="ui-state-highlight ui-corner-all" style="margin-top: 20px; padding: 0 .7em;">
        <p><span class="ui-icon ui-icon-info" style="float: left; margin-right: .3em;"></span>
            <strong>Hey!</strong> Sample ui-state-highlight style.</p>
    </div>
</div>

<div class="ui-widget hide">
    <div class="ui-state-error ui-corner-all" style="padding: 0 .7em;">
        <p><span class="ui-icon ui-icon-alert" style="float: left; margin-right: .3em;"></span>
            <strong>Alert:</strong> Sample ui-state-error style.</p>
    </div>
</div>

</body>
</html>