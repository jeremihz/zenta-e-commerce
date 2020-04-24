# ECommerceStore

<selenium web driver automation>

Project Title
project==Automation of Online E-Commerce 
page URL=="http://zentmall.herokuapp.com/"

Sample automation project of an online ecommerce  that sells and advertises products.
A user who visits the website is required to login first before placing an order.
Login is only allowed for users who have regestered accounts with the online system.
once logged into the site, user can order for an item, post an advert and evenorder requests for products.

Getting Started
Assumptions: You have already downloaded and are running eclipse
			: you have already downloaded the selenium project from GitHub

Go to File menu on eclipse>>click on import>>Existing projects into workspace>>Browse for root directory of where you saved your downloaded project>>Click on finish.

The project will appear along the other projects in your workspace

Contents of ECommerceStore Project
	
	src>>packages>>
	
	1.config -contains java file with class Action keywords, that will be called in the KeywrdDriven Framework
	
	2.DataDrivenFramework-Contains TestNg class of DataDrivenLogin, used to automate the various scenarios of login using the 	various login credentials provided in the data test excel file.
	
	3. KeywordDrivenFramework-contains class KeywordDrivenLogin java file used to automate the various keywords used in the testECommerceSite package for testing the site.
	
	4. testEcommerceSite-contains test cases for testing different functionalities of the website, such as login page and contacts module.
	
	5. utility-contains configurations of the excel files, the actions which will be performed on the excell file, such as geting data in the cells and rows.

Prerequisites
		1. Apache POI jar files
		2. JXL jar file
		3. TestNG(running tests with report generation, as well as for test NG annotation features)
		4. Testdata xls file with input data for email and password and an output of result status

Installing
download Apache POI from "http://www-us.apache.org/dist/poi/release/bin/poi-bin-3.17-20170915.zip"
unzip the downloaded file to a location of your choice.>Go to eclipse workspace>click on project>properties>java build 
path>libraries>add external jars>then locate where you extracted the Apache POI files and add them to the library>click on apply>apply and close

download JXL jar file from "http://www.java2s.com/Code/JarDownload/jxl/jxl.jar.zip"
unzip the file and follow the same steps from Eclipse workspace used to add Apache POI jar files to access and add the JXL jar file to the library.

Install TestNG:Launch the Eclipse IDE and from Help menu, click “Install New Software”.>You will see a dialog window, click “Add” button.>Type name as you wish, lets take “TestNG” and type “http://beust.com/eclipse/” as location. Click OK>>You come back to the previous window but this time you must see TestNG option in the available software list. Just Click TestNG and press “Next” button>> Click “I accept the terms of the license agreement” then click Finish>> You may or may not encounter a Security warning, if in case you do just click OK>> Click Next again on the succeeding dialog box until it prompts you to Restart the Eclipse>>You are all done now, just Click Yes>>Proceed with your workplace>>After restart, verify if TestNG was indeed successfully installed. Right click on you project and see if TestNG is displayed in the opened menu.

The tests are to be run  Using Test NG for test reports to be generated

Test cases created for: 1. Login(verify different login scenarios using valid and invalid credentials),
				2. Order of Item(shoes) once user has successfully logged into the system,
				3.change of user info in profile section(verify if user can change profile info).
				
				
Other Test Cases are for:
1.Keyword Driven Framework: An excel file with the keywords used in the scripts is linked to the test case.
	The test case runs in step by step, executing one method after another. 
	The script refers to excel.xlsx file with the column of Keywords, and only moves to the next statement if 
	keyword used in class corresponds with one in the excel file
	
2. Data Driven framework: 
The login test case is tested with different credentials of email and password combinations.
	The credentials are contained in an excel file with different data sets of email, and password.
	This is used to verify if user can be able to log into the system by providing invalid email and invalid password.
	And also the error message displayed when user tries to login using the different credentials.
	


Authors
jeremih odhiambo

