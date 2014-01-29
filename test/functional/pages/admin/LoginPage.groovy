package pages.admin

import geb.Page

/**
 * Representation of the admin login page.
 */
class LoginPage extends Page {

    static url = "admin/login"

    static at = {
        (title =~ "Login") as Boolean
    }

    static content = {
        txtLogin    { $("input[name=j_username]") }
        txtPassword { $("input[name=j_password]") }

        btnLogin { $("input.submit_login") }
    }

    def login(String name, String password)  {
        txtLogin = name
        txtPassword = password

        btnLogin.click()
    }
}
