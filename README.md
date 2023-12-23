# SubscriptionTest project:
This project is used to Navigate to this URL https://subscribe.stctv.com 
which Validate the Subscription Packages and gets The Type, Price, and Currency for 3 different Countries (i.e., Egypt, UAE, and Algeria) for each package. Then it prints the results in a notepad
the project demonstrates using the Page Object Model, Maven, Selenium, TestNG, and ExtentReports for reporting. 
Please note that when the test script executes the test on the validation environment, The page should be logged in as a prerequisite. 
Or the testers should have a testing credential from the dev team and then add the log-in steps in the setup script.

# Project Structure:
|-- src
|   |-- main
|   |   `-- java
|   |       `-- pages
|   |           |-- BasePage.java
|   |           |-- SubscribePage.java 
|   |-- test
|       |-- java
|       |   `-- tests
|       |       |-- BaseTest.java
|       |       |-- SubscribeTest.java
|       |-- resources
|           |-- drivers
|           |   `-- chromedriver.exe (or any other driver)
|           |-- config.properties
|           |-- extent-config.xml
|-- pom.xml
|-- README.md

