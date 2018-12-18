# DESCRIPTION

This piece was developed in IntelliJ IDEA using the Page Object Model (POM) pattern (or something closely approximating it :-) in Java (OpenJDK-8), using the Selenium-Firefox-Webriver. 

# SYNOPSIS

   $ mvn clean test

# OBSERVATIONS

Whilst developing the tests, the following unexpected behaviours were noticed...

* GDPR compliant - there is no facility for a user to delete their account including all the personal details; Neither is there a GDPR compliance statement.
* Password mail - requesting a password reminder mail does nothing i.e. no mail is generated.
* Search results ordering - the cost/expense ordering of search items always returns least expensive first irrespective of the requested ordering - consequently the associated scenario (requiring that the most expensive is first in the list) fails.
* Database access is required merely to access the home page - consistent ```Link to database cannot be established: SQLSTATE[HY000] [1203] User automa37_pr595 already has more than 'max_user_connections' active connections``` error.

# DEPENDENCIES

The following are all required to be available at run-time on the target system:

* Java 8
* Maven
* GeckoDriver (version used was 0.23.0)

All other dependencies - principally Java libraries - are both declared to and managed by, Maven.

# TO DO

* Use my Cuke-Trellis4j Cucumber test framework.
* Use PageFactory() to clean up.
