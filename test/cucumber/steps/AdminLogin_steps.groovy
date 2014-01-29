package steps

import pages.admin.LoginPage

import static cucumber.api.groovy.EN.*


Given(~'^a user opens the browser$') {->

}
When(~'^she opens the "([^"]*)" link$') { String link ->
    go link
}
Then(~'^she will get a login page$') {->
    at LoginPage
}