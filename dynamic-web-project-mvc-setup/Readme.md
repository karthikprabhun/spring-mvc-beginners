This project demonstrates key concepts of MVC architecture. What makes it unique is that it was created without using a Maven archetype, meaning we had to manually add the necessary JAR files in the project settings.

Previously, similar projects were created using IntelliJ but encountered issues, particularly with dispatcher initialization (possibly due to missing configurations).

In contrast, Eclipse provides a straightforward option to create a dynamic web application with no additional configuration needed. Although I spent a significant amount of time troubleshooting issues with the IntelliJ setup, I regret to say that it did not work.

Ultimately, since the goal of this project is to understand the core concepts of Spring MVC, the choice of IDE is not critical.


###  SPRING MVC Project (SET-UP) Configuring workspace with Spring,Tomcat & Spring doc ### 

Step 1 & 2 : Create dynamic web project and add relavent spring mvc core jars in to lib directory to understand the concept

step 3 : Config tomcat to project ( as we have run our class, html, jsp in server )

step 4 : Download internal spring soruce code ( optional ) 

# API Abstraction:

In Spring MVC, the library provides a layer of abstraction that simplifies the development of web applications. Here’s an overview of the key components and how they contribute to this abstraction:

### Key Components of Spring MVC Abstraction

1. **DispatcherServlet**:
   - The central component that handles all incoming requests. It acts as the front controller, routing requests to the appropriate handlers.

2. **Controller**:
   - Classes annotated with `@Controller` manage user requests. They contain methods that handle specific URL mappings, allowing for clear separation of business logic and presentation.

3. **View Resolver**:
   - This component resolves logical view names returned by controllers into actual view templates (e.g., JSP, Thymeleaf). It abstracts the view rendering process.

4. **Model**:
   - The model represents the data in the application. It can be passed between the controller and the view, often using `ModelAndView` or `Model` objects to carry data.

5. **HandlerMapping**:
   - This component maps incoming requests to the appropriate controller method. It abstracts the complexity of request handling and URL mapping.

6. **Annotations**:
   - Spring MVC leverages annotations like `@RequestMapping`, `@GetMapping`, and `@PostMapping` to simplify configuration and mapping. This reduces the need for extensive XML configuration.

7. **Validation**:
   - Spring provides a validation framework that abstracts the validation logic for model objects, allowing for easy integration with Spring MVC controllers.

8. **Exception Handling**:
   - With features like `@ControllerAdvice`, Spring MVC offers a way to handle exceptions across multiple controllers, providing a consistent error handling mechanism.

### Benefits of Abstraction in Spring MVC

- **Reduced Complexity**: Developers can focus on business logic without worrying about the underlying infrastructure.
- **Modularity**: Components can be easily replaced or modified, promoting a modular architecture.
- **Easier Testing**: The abstraction layers allow for easier unit testing of controllers and services.
- **Flexible Configuration**: The use of annotations and Java-based configuration reduces the need for XML, simplifying setup and maintenance.

In summary, Spring MVC's library abstraction provides a robust framework that streamlines the development process, enhances modularity, and facilitates easier testing and maintenance of web applications.


Hints: 

** Search if dispatherservlet class is present after library import.**

### Configuring the DispatcherServlet

To configure the `DispatcherServlet`, you use the `web.xml` file to initialize it with a specific name and set the mapping.

You can create the configuration file either manually or by using the option provided by your IDE (New -> Servlet).

**What is Load-on-Startup?**  
Setting the load-on-startup value to 1 ensures that the `DispatcherServlet` initializes during application startup.

The `servlet.xml` file is where you configure bean creation, auto-wiring, and other settings.

**When is the DispatcherServlet Initialized?**  
The dispatcher controller looks for a servlet with the prefix name "server-name."

The `ApplicationContext` is the core container for standalone applications, while the `WebApplicationContext` is specifically for web applications and extends the `ApplicationContext`.

You do not need to create the `WebApplicationContext` manually; it is automatically created in the `web.xml` file.

The `web.xml` file specifies the configuration file (`servlet.xml`), which includes the component scan path to register annotated components in the web application container.

All URL mappings are registered with the `DispatcherServlet`, which determines which handler method to call.

**What is the DispatcherServlet and How to Configure It?**

**What is a Front Controller?**





