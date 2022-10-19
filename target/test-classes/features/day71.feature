#/*
#TC #1: Window Handle practice
#1. Create new test and make set ups
#2. Go to : https://www.amazon.com
#3. Copy paste the lines from below into your class
#4. Create a logic to switch to the tab where Etsy.com is open
#5. Assert: Title contains “Etsy”

#Lines to be pasted:
#((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
#((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
#((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
#These lines will simply open new tabs using something called JavascriptExecutor
#and get those pages. We will learn JavascriptExecutor later as well.

# https://www.amazon.com
 @wip2
 Feature: task 7-1
  Scenario: Window Handle practice
   Given User is on  amazon page
   When user creates multiple tabs
   When user switches to Etsy tab.
   Then  user should see the Etsy in the title



