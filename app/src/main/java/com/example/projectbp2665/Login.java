package com.example.projectbp2665;

class Login {
    var username = ""
    var password = ""

    fun loginCheck():Boolean {
        if (username.equals("miftah") && password.equals("amikom")) {
            return true
        }else{
            return false
        }
    }
}