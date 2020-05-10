#####
**Installation**:
- 1.Your should make sure that the java is installed, to check it execute "java version" in terminal.
- 2.You should make sure that Java is written in the paths (if os Windows).
- 3.You should make sure that in Project bytecode version 
(Settings -> Build,Execution,Deployment -> Compiler -> Java Compiler) is the current version.
- 4.You should make sure that Java Runtime plugin is installed.
- 5.Your should make sure that the Maven is installed, to check it execute "mvn version".
- 6.You should make sure that Maven is written in the paths (if os Windows).
######
**Run tests**:
- 1.Create testng.xml and write suites, classes and tests in which you will run tests 
- 2.Create a parameter where name=browser and variable "browser" in testng.xml
- 3.Add maven-surefire-plugin to pom.xml (use mvn documentation)
- 4.Write a variable for the testng.xml in surefire-plugin
(example, <suiteXmlFile>src/test/resources/${filename}.xml</suiteXmlFile>)
- 5.Add dependencies for browser driver (ex. chrome driver)
- 6.Create Enum file, and create enum class Browsers there, where write browsers which you will use
- 7.Create setUp class with @Parameters ("browser") and switch-case structure with browsers which you will use in this class
- 8.Use command "mvn package -D{{filename}}=testng -Dbrowser=CHROME", where -D is parameter
