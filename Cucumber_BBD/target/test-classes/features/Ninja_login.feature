Feature: verify Login functionnality

@core
Scenario Outline: Verify login page
Given login page should be open in default browser
When click on email address field and add valid email "<email1>"
And then click on password field and enter valid "<password1>"
And now click on login button "<Status>"
Then login successfully and redirect to ninja home page
Examples:
| email1         | password1  | Status  |
| tapa@gmail.com | admin@123  | success |
| iausih         | password   | fail    |
| username       | asdad      | fail    |

	