MVC, or Model-View-Controller, is an architectural pattern used in software development to separate an application into three interconnected components. This separation helps organize code, promotes modularity, and enhances maintainability. Here’s a breakdown of each component:

### 1. **Model**
- **Definition**: Represents the data and business logic of the application.
- **Responsibilities**:
    - Manages the data and rules of the application.
    - Notifies the view of any changes to the data.
    - Interacts with the database or data sources to fetch or update information.
    - In a Spring MVC context, models can include domain objects and data transfer objects (DTOs).
- **Example**: In a web application, the model might represent user accounts, products, or any other data entities.

### 2. **View**
- **Definition**: Represents the user interface and is responsible for displaying data to the user.
- **Responsibilities**:
    - Presents the data provided by the model in a user-friendly format.
    - Handles user interactions, such as clicks or inputs, and may trigger controller actions based on those interactions.
    - In Spring MVC, views can be implemented using technologies like JSP, Thymeleaf, or FreeMarker.
- **Example**: In a web application, views can be implemented using technologies like HTML, CSS, JSP, or templating engines like Thymeleaf.

### 3. **Controller**
- **Definition**: Acts as an intermediary between the model and the view.
- **Responsibilities**:
    - Handles user input and interactions.
    - Processes requests, updates the model, and selects the appropriate view for rendering.
    - Implements application logic and directs the flow of data between the model and the view.
    - In Spring MVC, controllers are typically annotated with @Controller or @RestController.
- **Example**: In a web application, a controller might handle HTTP requests, process form submissions, and return a view name to be rendered.

### Benefits of MVC
- **Separation of Concerns**: Each component has a distinct responsibility, making the codebase more organized and easier to manage.
- **Modularity**: Changes to one component (e.g., the view) can often be made without affecting the others (e.g., the model).
- **Testability**: The separation makes it easier to test individual components in isolation.

### Summary
MVC is a widely used architectural pattern that helps developers create scalable and maintainable applications by dividing them into three main components: Model, View, and Controller. This structure facilitates better organization, clearer logic, and easier collaboration among development teams.

## Spring MVC key components

Spring MVC consists of several key components that work together to handle web requests and responses in a structured manner. Here are the main components:

### 1. **DispatcherServlet**
- The front controller that handles all incoming HTTP requests and delegates them to the appropriate controllers.

### 2. **Controller**
- Components annotated with `@Controller` or `@RestController` that contain request-handling methods. Controllers process user input, interact with the service layer, and return a view or data.

### 3. **Handler Mapping**
- Maps incoming requests to the appropriate handler (controller method). This can be done using annotations like `@RequestMapping` or through XML configuration.

### 4. **View Resolver**
- Resolves the view (e.g., JSP, Thymeleaf) based on the logical view name returned by the controller. Common implementations include `InternalResourceViewResolver` and `ThymeleafViewResolver`.

### 5. **Model and ModelAndView**
- The `Model` interface is used to pass data from the controller to the view. The `ModelAndView` object combines both the model data and the view information.

### 6. **View**
- The actual presentation layer (e.g., JSP, Thymeleaf) that renders the response based on the model data provided by the controller.

### 7. **Form Handling**
- Spring MVC provides support for handling form submissions using the `@ModelAttribute` annotation to bind form data to Java objects.

### 8. **Exception Handling**
- You can handle exceptions globally using `@ControllerAdvice` or locally within a controller using `@ExceptionHandler`.

### 9. **Interceptors**
- Implement the `HandlerInterceptor` interface to intercept requests before they reach the controller and after the view is rendered. This can be used for logging, authentication, or modifying requests and responses.

### 10. **Handler Adapter**
- Works with handler mappings to invoke the correct handler method (controller) based on the request.

### Summary
These components collaborate to provide a comprehensive framework for building web applications using the Model-View-Controller design pattern. Together, they facilitate request processing, data binding, view resolution, and exception handling, making it easier to develop robust web applications.

# DEMO
Spring MVC project setup demo
* Using XML based configuration
    web.xml and context config present in *-servlet.xml
    web.xml has servlet which creates context in turn has controller.
* Using Java annotation based configuration
    removed web.xml & *-servlet.xml as we can achieve same using java way. 
    Inherit AbstractAnnotationConfigDispatcherServletInitializer and set central configuration     
    class includes component scan & InternalResourceViewResolver
* Using Spring boot
    Add spring-boot-starter-parent as parent which does dependency management
    Add dependency spring-boot-starter-web which has webmvc , servlet , tomcat along with others
    Add tomcat-embed-jasper to resolve jsp pages
    Don't need tomcat server explicitly as have embedded tomcat
    SpringApplication.run() will create the container or context behind the scene automatically. i.e no need to add web.xml / appconfig class with resource resolver  or -Servlet.xml / DispatcherServletInitializer

First we will build using xml based,transform to java annotation and then to Spring boot based.

***Hint:***
Understand server log 
org.springframework.web.servlet.FrameworkServlet.initServletBean Initializing Servlet 'dispatcher'

## MVC Flow Diagram

+--------------------+
|      Client        |
|  (Web Browser)     |
+---------+----------+
        |
        v
+--------------------+
|   DispatcherServlet |
+---------+----------+
        |
        v
+--------------------+     +-----------------+
|   Handler Mapping   |<--->|     Controller  |
| (Finds the right   |     +--------+--------+
|    handler method) |              |
+---------+----------+              |
            |                         |
            v                         |
+--------------------+             |
|      Model         |<------------+
| (Business Logic,   |
|  Data Access, etc.)|
+--------------------+
        |
        v
+--------------------+
|       View         |
| (JSP, Thymeleaf,   |
|  etc.)            |
+--------------------+
        |
        v
+--------------------+
|      Client        |
|  (Web Browser)     |
+--------------------+


## Fundamental building blocks for Java web applications

In addition to servlets, several other fundamental building blocks are essential for Java web applications. Here are some key components:

### 1. **JavaServer Pages (JSP)**
- A technology that allows developers to create dynamically generated HTML pages based on XML or HTML code. JSPs are compiled into servlets, which makes them a powerful tool for building views in web applications.

### 2. **JavaServer Faces (JSF)**
- A component-based UI framework for building web applications. JSF provides a set of reusable UI components and facilitates event handling and data binding, making it easier to create complex user interfaces.

### 3. **Spring Framework**
- A comprehensive framework that provides support for various aspects of Java development, including dependency injection, aspect-oriented programming, and web applications through Spring MVC. Spring Boot simplifies the setup and development of Spring applications.

### 4. **RESTful Web Services**
- Java provides various frameworks (like Spring MVC, JAX-RS) to create RESTful web services, enabling communication between clients and servers using standard HTTP methods (GET, POST, PUT, DELETE).

### 5. **Java Persistence API (JPA)**
- A standard for object-relational mapping (ORM) in Java, allowing developers to manage relational data in applications using Java objects. JPA is commonly used with frameworks like Hibernate.

### 6. **Spring Data**
- Part of the Spring ecosystem, it simplifies data access and integrates with JPA, JDBC, and NoSQL databases, providing a consistent approach to data manipulation.

### 7. **WebSockets**
- A protocol that enables full-duplex communication channels over a single TCP connection, allowing for real-time data transfer between clients and servers.

### 8. **Servlets**
- Servlets are Java programs that run on a web server and handle client requests, typically in the context of a web application. They are a key component of Java EE (Enterprise Edition) and are used to create dynamic web content.