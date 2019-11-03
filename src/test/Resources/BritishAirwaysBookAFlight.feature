@britishAirwaysBookAFlight
Feature: British Airways Book A Flight

@bookAFlight
Scenario: Booking a flight to Paris
Given launch british airways URL "https://britishairways.com"
When click on Book
And click on Book a flight
Then check British Airways Flight page is opened
Then click on More destinations under Europe
Then enter France in To Field
And Select One way
And select Travel Class as First class
And click on Find lowest price
Then the page should show "No destinations Available" under Euorpe,UK and Ireland.



