#Introduction
This project shows how we can create an easy crud rest api flowing hexagonal architecture principles. These principles are:
* Explicitly separate Application, Domain, and Infrastructure.
* Dependencies are going from Application and Infrastructure to the Domain.
* We isolate the boundaries by using Ports and Adapters.

IMP NOTE: This project uses and h2 memory, which has tow default users added (must see application.yml and data.sql)

#Test it
First of all, we have to build our project, using mvn clean install. After that, we can run our application using mvn spring-boot:run. Finally, we can use the following curl examples to test it:

* curl -v http://localhost:8080/user/2  -> it recovers the second default user added when we launch the app
* curl -d 'name=test&email=test@mig.com' http://localhost:8080/adduser   -> it adds a new user
* curl -d 'name=newTest&email=newTest@baeldung.com' http://localhost:8080/update/3  -> it updates the user added before
