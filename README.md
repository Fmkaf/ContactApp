# ContactApp

Prerequisite:
You should have the following installed on your system
->Node.js : https://nodejs.org/en/download/
->JDK     : https://docs.oracle.com/en/java/javase/17/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A
->VScode : https://code.visualstudio.com/download
->MySql
How to run the App:
Download the ContactApp repo zip file
***Download the FronEndFadi repo also for the frontend and use this folder instead of "FrontEnd": https://github.com/Fmkaf/FrontEndFadi***
Step-1:Open the unzipped file
Step-2:Open VScode and install corresponding extensions
      ->Spring Boot Extension Pack
      ->Spring Boot DashBoard
Step-3:Open the "BackEnd"(included inside unzipped Folder) folder in VScode by File->Open Folder->(Provide path)
       Wait for the file to load
Step-4:Now in the explorer Window under "BackEnd" go to src->main->resources-> and click on "application.properties
Step-5:In application.properies
      ->Provide your database name(any database created in mysql) by replacing "LoginDatabase" of spring.datasource.url
      ->Provide your database username and password at the corresponding sections by replacing the default value
      ->Save the file
Step-6->Run the application by pressing F5 or using the SPRING BOOT DASHBOARD which can be found at the bottom of explorer window
       Wait for some time and the application will run
Step-7:Open a new window in VScode by File->Window
Step-8:Open the "FrontEnd" folder (included inside unzipped Folder) in VScode by File->Open Folder->(Provide path)
Step-9:Press Ctrl+` and now a terminal will be opened at the bottom
Step-10:Make sure you are in "FrontEnd" directory inside the terminal
       Type "npm install" and then press Enter 
       Then type "npm start" and then press Enter
       Wait for some time and the browser will be open automatically
       (You should give the necessary permissions if required)
Step-11:In the browser
        click on SignUp and create an account and use those credentials to signin.
