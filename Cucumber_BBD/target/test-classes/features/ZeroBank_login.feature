Feature: verify zero bank Login functionnality
Scenario Outline: Verify zero bank login page
Given bank login page should be open in default browser
When click on username field and add valid user <username1> and <password1> and <status>
Then login successfully and redirect to bank home page
Examples:
|username1|password1|status|
|username|password|success|
|iausih|password|fail|
|username|asdad|fail|
|asdads|asdads|fail|
	