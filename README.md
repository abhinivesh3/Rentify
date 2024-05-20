# Rentify
Project Setup Instructions
Prerequisites
Java version 17
Ensure that Java version 17 is installed on your system. You can download it here.

Maven 3.9.6
Install Maven version 3.9.6. You can download it here.

Installation
Ensure Java and Maven are Installed
Verify that Java 17 and Maven 3.9.6 are installed by running the following commands in your terminal:

bash
Copy code
java -version
mvn -version
Clone the Repository
Clone this repository to your local machine using the following command:

bash
Copy code
git clone <repository-url>
Running the Project
Navigate to the Project Directory
Change directory to the project root:

bash
Copy code
cd <project-directory>
Build the Project
Execute the following command to clean and build the project:

bash
Copy code
mvn clean install
Run the Project
Once the build is successful, you can run the project using the following command:

bash
Copy code
mvn exec:java -Dexec.mainClass="com.example.YourMainClass"
Application Features
User Registration
The application should allow a user to register as either a Seller or a Buyer.
Seller Flow
Post Property: Sellers can post properties by providing essential details such as location, area, number of bedrooms, bathrooms, nearby hospitals, and colleges.
View Properties: Sellers can view the list of properties they have posted.
Update/Delete Properties: Sellers can update or delete their properties.
Buyer Flow
View Properties: Buyers can view all the posted rental properties.
Express Interest: If interested in a property, buyers can click on the "I'm Interested" button on the property widget to view the seller's details.
Apply Filters: Buyers can apply filters based on property details such as location, area, number of bedrooms, etc.
Frontend and Backend Technologies
Frontend: HTML, CSS, JavaScrip(Thmeleaf)
Backend: Spring Boot
Directory Structure
css
Copy code
<project-root>
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── YourMainClass.java
│   │   ├── resources
│   │   │   ├── application.properties
│   │   │   └── static
│   │   │       ├── index.html
│   │   │       ├── css
│   │   │       └── js
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── YourMainClassTest.java
│
├── pom.xml
└── README.md
Please replace YourMainClass with the actual main class of your project and https://github.com/abhinivesh3/Rentify/ with the actual URL of your Git repository.

Additional Notes
Ensure that the application.properties file is correctly configured for your database and other configurations.
For any issues, refer to the official documentation of Spring Boot and Maven.
