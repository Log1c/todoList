# Todo List Application (Task 1)

This is a simple Todo List application built with Spring Boot and Hibernate. It provides basic CRUD (Create, Read, Update, Delete) functionality for managing todo items.

## Sum up
### Time spending: 4 hours
 The application works without tests.
### What items failed:
 - add check style
 - run tests
### Challenges:
 - Sometimes the chat "forgot the context". It confused the versions of the libraries.
 - I could not teach him how to add checkstyle. It used the old approach which doesn't work in newer versions.
 - Interestingly, if you ask him for a long time about a specific problem, he asks for clarification of the context. How was it with adding a dependency on jakarta.


## ChatGPT prompts:
https://chat.openai.com/share/e1d3d6f5-ffe8-4f9c-9f5d-ba831be6427c

## Requirements

- Java 11 or higher
- Gradle 7.6.1 or higher

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/todoList.git

2. Navigate to the project directory:

   ```bash
    cd todoList

3. Build the project:

   ```bash
    mvn clean install
   
4. Run the application:

    ```bash
   mvn spring-boot:run
   
5. Open your web browser and visit http://localhost:8080 to access the Todo List application.

## Usage
The Todo List application provides a simple web interface for managing your todo items. You can perform the following operations:

Create a new todo item by clicking on the "Add Todo" button and providing the necessary details.
View the list of existing todo items on the home page. Each item displays its title and description.
Edit a todo item by clicking on the "Edit" button next to it and updating the details.
Delete a todo item by clicking on the "Delete" button next to it.

## Technology Stack
Java
Spring Boot
Spring Data JPA
Hibernate
Thymeleaf (for server-side rendering)
HTML/CSS

## Contributing
Contributions to the Todo List application are welcome! If you find any bugs or have suggestions for improvement, please open an issue or submit a pull request.

## License
This project is licensed under the MIT License.

Feel free to modify the content according to your specific project details, such as adding additional sections or customizing the technology stack.
