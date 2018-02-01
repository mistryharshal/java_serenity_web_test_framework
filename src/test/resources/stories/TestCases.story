Scenario: 1. Create an entry for a given hotel details

Given the user is on the application login page
When the user click Login and enters Username [usrName] and Password [password] and clicks Login button
Then user should  be able to login into application
When user enters hotel deatails Hotelname [hotel] address [cityName] owner [owner] phone [phone] email [email]
And user clicks create button
Then an entry for the hotel is created
And user clicks logout

Examples:
|usrName|password|hotel    |cityName|owner|phone|email		  |
|admin  |password|Hotel ABC|City1	|XyZ  |12345|hotel1@me.com|


Scenario: 2. Create an entry in a hotel for customer

Given the user is on the application login page
When the user click Login and enters Username [usrName] and Password [password] and clicks Login button
Then user should  be able to login into application
When user searches for a hotel [hotelname]
Then hotel [hotelname] is displayed
When user click on seach result
And user enter deatails firstname [fname] lastname [lname] price [price] deposit [deposit] checkin [cin] checkout [cout]
And user clicks create_cut button
Then an entry for the customer is created
And user clicks logout

Examples:
|usrName|password|hotelname|fname|lname|price|deposit|cin	   |cout	  |
|admin  |password|Hotel ABC|Bean |ABC  |12345|true	|2017-07-22|2017-07-26|

Scenario: 3. Detele an entry for a given hotel details

Given the user is on the application login page
When the user click Login and enters Username [usrName] and Password [password] and clicks Login button
Then user should  be able to login into application
When user searches for a hotel [hotelname]
Then hotel [hotelname] is displayed
When user click on seach result
And user deletes a customer [customer] entry
Then customer [customer] entry is deleted
And user clicks logout

Examples:
|usrName|password|hotelname|customer|
|admin  |password|Hotel ABC|Bean	|


