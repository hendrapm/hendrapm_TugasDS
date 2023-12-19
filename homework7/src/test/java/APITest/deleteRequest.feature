Feature: Petstore Delete Request

Background: 
  Given url baseURL
  * def username = 'myuser'
  * def headersRequest = { Accept: 'application/json', Content-Type: 'application/json' }

@usertest
Scenario: Delete existing user
  When path "/user/" + username
  And headers headersRequest
  And method delete
  Then status 200
  And response.message == username