Feature: Petstore Get Request

Background:
  Given url baseURL
  * def username = 'myuser'
  # And print "----------- Coba test regres -----------"

@usertest
Scenario: Get existing user by username
  When path "/user/" + username
  And method get
  Then status 200
  And response.username == 'myuser'
  And response.firstName == 'My'
  And response.lastName == 'User'
  And response.email == 'myuser@email.com'
  And response.phone == '081'