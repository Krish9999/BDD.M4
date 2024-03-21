#Author MSK
Feature: Login to Vtiger Application

	Scenario: Login to Application with Valid Credentials
	Given I want to launch the browser
	And Load the URL
	When Login page is displayed enter the username and password
	And Click on login button
	Then Validate the Login page	
