package com.justa.projeto_login.view.login.widgets

import com.justa.projeto_login.view.login.LoggedInUserView

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)