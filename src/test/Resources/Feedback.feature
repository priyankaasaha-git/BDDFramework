@britishAirwaysFeedback
Feature: To check the Feedback popup.

@SiteFeedback
Scenario: To check the SiteFeedback under Feedback popup.
Given launch british airways URL "https://britishairways.com"
Then click on Feedback tab
And check British Airways feedback popup is opened.
Then click on SiteFeedback frame
And check the rating popup is opened.
When click on only one smiley
Then check Please tell us more options are visible to user
Then enter the experience in the textbox
When click on Done button
Then Good to know popup is opened
When click on Done button again
Then check the current BA page is open.

