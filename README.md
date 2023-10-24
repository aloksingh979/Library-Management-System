# Library-Management-System
The provided Java project implements a Library Management System (LMS) using the Model-View-Controller (MVC) architecture. Here's a brief report on the project:

1. **Project Overview**:
   - The project focuses on managing a library with functionalities like adding books, removing books, updating book prices, searching for books by name, and retrieving a list of all books.

2. **MVC Architecture**:
   - The project follows the MVC architectural pattern:
     - **Model**:
       - `Book` class represents the data model for a book with attributes like name, author, price, and publication.
       - `Library` class represents the model for a library with attributes like name, address, pincode, and a list of books.
     - **View**:
       - The `View` class is responsible for user interaction. It provides a console-based interface for users to perform operations on the library.
     - **Controller**:
       - The `Controller` class acts as an intermediary between the View and the Model. It contains methods to handle user actions, manipulate data, and update the model.

3. **Functionalities**:
   - **Add Book**:
     - Allows users to add a new book to the library by providing details like name, author, price, and publication.

   - **Remove Book**:
     - Enables users to remove a book from the library by providing the book's name. It checks if the book exists before removing.

   - **Update Book Price**:
     - Allows users to update the price of a book by providing the book's name. It verifies if the book exists before updating.

   - **Search Book**:
     - Allows users to search for a book by its name. It returns the book details if found, otherwise, it indicates that the book is not in the library.

   - **Get All Books**:
     - Retrieves a list of all books currently available in the library.

4. **User Interaction**:
   - The `View` class provides a user-friendly console interface. It prompts users to select an operation and then guides them through the necessary steps to perform the chosen action.

5. **Initialization**:
   - The project starts by initializing the library's name, address, and pincode through user input.

6. **Data Handling**:
   - Data is stored in Java objects (`Book` and `Library`) and managed through methods provided in the `Controller` class.

7. **Error Handling**:
   - The system is designed to handle cases where a user attempts to perform an operation on a non-existent book.

8. **Feedback to User**:
   - The system provides appropriate feedback messages after each operation, informing the user about the outcome (success or failure).

9. **Loop-based Interface**:
   - The program runs in a loop, allowing users to perform multiple operations in a single session without needing to restart the program.

10. **Exit Option**:
    - Users can choose to exit the program, which is handled gracefully.

11. **Future Enhancements**:
    - Possible improvements could include adding more robust error handling, incorporating a persistent data storage mechanism, and implementing a graphical user interface (GUI) for improved user experience.

In summary, this Java project effectively demonstrates the implementation of a Library Management System using the MVC architectural pattern, providing essential functionalities for managing books in a library.
