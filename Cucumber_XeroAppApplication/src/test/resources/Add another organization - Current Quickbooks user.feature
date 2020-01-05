Feature: Add another organisation to Paid Version of Xero App and Check the 
currentlyusingquickbooks checkbox and then click on buy now button


Scenario: Organization added should be with the "Paid" Subscription and Established Plan Chosen
 Given User logs into the application with correct username and pwd
 Then Click on myXero link from the top left menu
 When Add one more organisation with paid version
 Then Check the currentlyusingquickbooks checkbox and click buynow button