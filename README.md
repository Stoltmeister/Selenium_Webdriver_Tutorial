# Selenium_Webdriver_Tutorial

Created new Maven Project with IntelliJ.

Tutorial called "Automated Web Testing with Selenium and Webdriver and Java" in pluralsight.

Additional setup info in WebDriverDemo.java 

# Selenium_Server:

- Setting up a grid with cmd (can use any port): java -jar "selenium-server-standalone-3.141.59.jar" -port 8090 -role hub
- the URL to see your grid config will look like this "http://(your ip):8090/grid/console" its the link that is given to you after entering the above command for registering your nodes except "console" instead of "register" at the end
- make sure nodes are on different ports or it will fail
- if using linux can give you more options
