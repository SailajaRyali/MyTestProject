Feature: ZigWheels and CarDekho Feature

Background: 
When User is in Zigwheels home page	

Scenario: ZigWheels News and Ask question
Then mouse hover on News & Reviews tab
Then click on Gallery option
Then verify user navigated to Image Gallery
Then user quits the browser
 
Scenario: ZigWheels Search Gallery:
Then mouse hover on News & Reviews tab
Then click on Gallery option
Then verify user navigated to Image Gallery
Then SelectMake dropdown is populated with bike options and select bike from DD
Then SelectModel dropdown is populated with appropriate bike model and select one bike model from DD
Then Click on Search button to view search related bikes
Then user quits the browser


#Scenario: ZigWheels New cars page navigation
#Then user Mouse hover on New Cars 
#And clicked on Tyres
#Then Verify that User navigate to TyreDekho page


