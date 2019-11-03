@britishAirways1
Feature: British Airways Login

Scenario Outline: Login check for Bristish Airways
Given launch british airways URL "https://britishairways.com"
Then enter username in <LoginID> textbox
And enter the password in <Pin/Password> textbox
When click on Login button
Then check the <Status>

Examples:

| Login | Pin/Password | Status |
| chiranjitkrsaha2009@gmail.com | Page@12345 | Success |
| priyankaa.saha19@gmail.com | Page@12345 | Fail |
