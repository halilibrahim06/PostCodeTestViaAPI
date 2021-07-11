# Post Code Test Via API

TOOLS AND EXPLANATIONS

The project has been prepared based on Cucumber BDD style.
Maven build management tool is used in this project by Java (JDK8+) language.
In the project created by using the Page Object Design Pattern, the data were collected under the pages package.
Dependencies have been prepared under the pom.xml file. The project was tried to be controlled from the centre using configuration.properties and ConfigurationReader.

**Technology Stack**

•	Java

•	Maven

•	Cucucmber

•	JUnit

**Prerequisites**

•	Windows

•	Java 1.8 - Java Dev Kit

•	Maven - Dependency Manager

•	IntelliJ IDEA – IDE


**HOW TO RUN TESTS**

```
-> Under the runners package "CukesRunner" right click and run CukesRunner. Also path "src > test > java > com > qdoctor > runners > CukesRunner"

-> mvn verify --> in the IDE console or navigate project path in command line and run.
```

**HOW TO CREATE TEST REPORTS**

1-) When you run tests with the "mvn verify" command from the console, you can see Cucumber Html Report under the target file.
```
-> target -> cucumber-html-reports > overview-steps.html (open with chrome option)
```
2-) Second type of report, the project is run from Runner class, a Cucumber Report link is created in the IDE console automatically.
```
Sample link -> View your Cucumber Report at: (Works 24 hours later than it will delete automatically)
```
http://localhost:63342/QDoctor/target/cucumber-html-reports/overview-features.html?_ijt=etm6qb6gn85k4edkue3kmgejn9

3-) To run a special tag, when you type @001 in the tags (tags = "@001") section in the Runner, only that tag will work specifically. 


**Halil Erdogan**

QA Automation Engineer | SDET
