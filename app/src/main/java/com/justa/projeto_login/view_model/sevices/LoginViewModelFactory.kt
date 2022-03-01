package com.justa.projeto_login.view_model.sevices

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.justa.projeto_login.view_model.sevices.service.LoginDataSource
import com.justa.projeto_login.view_model.sevices.service.LoginRepository

/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
class LoginViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(
                loginRepository = LoginRepository(
                    dataSource = LoginDataSource()
                )
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}