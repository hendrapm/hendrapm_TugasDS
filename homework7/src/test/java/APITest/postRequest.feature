Feature: Petstore Post Request

Background: 
  Given url baseURL
  * def bodyRequestUser = 
    """
    [
      {
        "username": "myuser",
        "firstName": "My",
        "lastName": "User",
        "email": "myuser2@email.com",
        "password": "myuser",
        "phone": "081",
        "userStatus": 0
      }
    ]
    """
  * def headersRequest = { Accept: 'application/json', Content-Type: 'application/json' }

@usertest
Scenario: Create user with list
  When path "/user/createWithList"
  And headers headersRequest
  And request bodyRequestUser
  And method post
  Then status 200
  And response.message == 'ok'
