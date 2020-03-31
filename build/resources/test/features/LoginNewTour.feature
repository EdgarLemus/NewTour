Feature: Test Background Feature
Description: The purpose of this feature is to test the Background keyword

Scenario Outline: Login Successfully
	Given That user is on Homepage of New Tour
	When He registers in the system
	|user|password|
	|<User>|<Password>|
	Then He can to see the message <Message> in screen
	
	Examples:
	|User|Password|Message|
	|Arctyrael|seleniumlomejor|registered in the system|