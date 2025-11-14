# Spring Boot Application

## Description
This project is a simple Spring Boot application for managing tasks.

## Technologies
- Java 21
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Lombok

### Prerequisites
- Java 21
- Gradle
- PostgreSQL database running locally

##### Java
Make sure Java is installed on your laptop
- open a terminal and type `java --version`, you should see the version returned
- if no version returned, download link: https://adoptium.net/temurin/releases/)

##### Postgresql
- Go to: https://www.postgresql.org/download/
- Choose your OS → Install PostgreSQL + pgAdmin.
- Run the Installer
- Password for the postgres superuser → remember this! (password is postgres)
- Port (default is 5432) → keep default.
- Open pgAdmin to Create a test database
	- Right-click Databases
	- 3. Create → Database
	- 4. Name it something like to-do-list


##### Lombok
enable annotation processing

- Project → Properties
- Java Compiler → Annotation Processing
- Check:
- ✔ Enable annotation processing
- ✔ Enable project specific settings
- Click Apply and Close.

##### Postman
- download: https://www.postman.com/downloads/
- import this collection into postman: src/test/resources/to-do-list.postman_collection.json



### Run the application:
1. ./gradlew bootRun
or
2. right click on ToDoListApiApplication, then run as -> Java Application

server starts at http://localhost:8080



### API Endpoints

##### Create a new task
POST	/api/tasks	

- sample request: 
{
    "note": "Finish writing the report",
    "dueDate": "2025-12-15"
}


##### Get a task by ID
GET	/api/tasks/{id}	

##### Update a task by ID
PUT	/api/tasks/{id}	

##### Delete a task by ID
DELETE	/api/tasks/{id}	

