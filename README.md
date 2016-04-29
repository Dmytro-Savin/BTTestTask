# BL Test Task

### Description:
This project represents simple example of automated test that logs into the Gmail, either with given credentials, or with default ones.
 It uses Selenide, TestNG, and Allure frameworks to run tests and build reports.
 Maven should be used to build the project and run tests.
 Currently project has no many options that would be nornally used, e.g. logging, different profiles, etc. The test neither makes complex verifications.
 All of them were not added, as there were not much time given for this task preparation, I can add them later if they are requested though.

 ### Instructions:
 To run the test you will have to install Maven and Firefox.
 To start execution do the following:
 * open command line (make sure Maven is set up properly by typing 'mvn -version'. This should result to a short list of Maven info).
 * execute 'mvn clean test' command to run the test. In this case a default parameters (email and password) will be used.
  If you would like to change the default parameters, you may replace them in ./src/test/java/testng.xml file
 * execute 'mvn clean test -Demail=DESIRED_EMAIL -Dpassword=<DESIRED_PASSWORD',
 where DESIRED_EMAIL is the email you'd like to use, and DESIRED_PASSWORD is the password that will be submitted on the Gmail page.
 Choose this option if you would like make no changes to any files, and run the test with your own credentials.
  * execute 'mvn site' command to build a report. When command execution is finished the report will be put into ./target/site/allure-maven-plugin/index.html
  Note: I observed some issues with report displaying in Chrome, so, please, use Firefox to view it.

  Basically, this is it. Please, contact me by Skype in case some clarification is needed.