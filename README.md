## Over view
Design automation testing script usig java as a progarming lanagauge and selenium as automation testing tool 
i used Page object model as a design pattern and TestNg frame work 
to run 5 test cases 
- validate if user try to resgister with valid data
- validae if user try to register with invalid credentials ( error validation should appear)
- validae if user try to login with valid credentais
- validate if user try to login with invalid credentials
- verify if user can add product to cart
  then generate HTML report 


## Using page object model as design pattern 
to create separate object repositories and store web elements, like links and buttons. 
to reduce the duplication of code and facilitate efficient test maintenance
Methods get more realistic names which can be easily mapped with the operation happening in UI. i.e. if after clicking on the button we land on the home page
using package for pages contain locators and actions and package for test to assert in test cases 

 ## Using TestNG frame work 
to Generate the report in a proper format including a number of test cases runs
Using testng, you can execute multiple test cases on multiple browsers, i.e., cross browser testing.
to  manage excution flow can Annotations used in the testing are very easy to understand ex: @BeforeMethod, @AfterMethod, @BeforeTest, @AfterTest
Annotations in TestNG are lines of code that can control how the method below them will be executed
They are always preceded by the @ symbol. A very early and quick TestNG Example is the one shown below.
to generate HTML report (TestNG has the ability to generate reports in HTML format.) 

##  dependencies installation 
- from MVN mvnrepository compatible versions for selenium 
- <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-support</artifactId>
            <version>4.16.1</version>
        </dependency> 
- compatible versions for TestNG 
- <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.10.2</version>
            <scope>test</scope>
 </dependency> 

        ## very important note 
       - Writing test cases in Zephyr-scale integrated with jira did not completed 
       - data source is hard coded ( using data driven testing ) 
       because i have no time . please accept my apology.      


