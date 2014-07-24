/*
 * Copyright (c) Cognitivenode 2014. All Rights Reserved.
 *
 * No part of this source code or any of its contents may be reproduced, copied,
 * modified or adapted, without the prior written consent of the author,
 * unless otherwise indicated for stand-alone materials.
 */

function emptyCheck() {

    $("form input:text, form input:password").each(function() {
        if($(this).val().length <=0) {
            $(".ui-state-highlight").parent().removeClass("hide");
            $(".ui-state-highlight").parent().addClass("show");
        }
    });

    if($(".ui-state-highlight").parent().hasClass("hide")) {
        return true;
    }
    return false;
}

function resetMessages() {

    if($(".ui-state-highlight").parent().hasClass("show")) {
        $(".ui-state-highlight").parent().removeClass("show");
        $(".ui-state-highlight").parent().addClass("hide");
    }

    if($(".ui-state-error").parent().hasClass("show")) {
        $(".ui-state-error").parent().removeClass("show");
        $(".ui-state-error").parent().addClass("hide");
    }
}

function errorCheck() {

    if(window.location.href.indexOf("?error=true") > -1) {
        $(".ui-state-error").parent().removeClass("hide");
        $(".ui-state-error").parent().addClass("show");
    }
}