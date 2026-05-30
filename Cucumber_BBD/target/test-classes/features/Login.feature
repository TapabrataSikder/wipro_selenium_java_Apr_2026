Feature: verify Login functionnality
Scenario Outline: Verify login page
Given login page should be open i default browser
When click on username field and add valid user <username1>
And then click on password button and enter valid <password1>
And now click on submit button <status>
Then login successfully and redirect to home page
Examples:
|username1|password1|status|
|username|password|success|
|iausih|password|fail|
|username|asdad|fail|
|asdads|asdads|fail|
	