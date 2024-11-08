# Event Booking System

This is a Java-based event booking system with a graphical user interface (GUI) that allows users to select an event type (Musical or Sport Game), input the number of tickets, and calculate the total cost of the booking. The application uses Object-Oriented Programming (OOP) principles, such as interfaces, abstract classes, and inheritance, to model events and their respective booking calculations.

## Features

- **Event Selection**: Users can choose between two types of events — a Musical concert or a Sport Game.
- **Ticket Count**: Users can specify the number of tickets they want to book.
- **Booking Calculation**: The system calculates the total cost based on the event type and ticket count.
- **Error Handling**: Handles invalid input (non-numeric values) gracefully with error messages.

## Classes

1. **Ticket (Abstract Class)**  
   Represents a generic event ticket with common properties like ticket number, event name, event location, and event date.
   
2. **Musicals (Class)**  
   A subclass of `Ticket` that represents a musical event. Implements the `IBooking` interface for calculating booking costs.

3. **SportGame (Class)**  
   A subclass of `Ticket` representing a sports event. Implements the `IBooking` interface for calculating booking costs.

4. **IBooking (Interface)**  
   Defines the method `calculateBooking(int noTickets)` that must be implemented by any event class to calculate the total cost for the specified number of tickets.

5. **Question2 (Main JFrame Class)**  
   The main JFrame class that sets up the GUI, allowing users to interact with the system. It handles user input and displays the booking details or error messages.

## Setup

1. Ensure you have Java 8 or higher installed on your machine.
2. Clone or download this repository.
3. Compile and run the `Question2.java` class to start the event booking system.

### To Compile and Run:
1. Open a terminal/command prompt.
2. Navigate to the directory containing the source files.
3. Compile the code using:
   ```bash
   javac Solution/*.java
   ```
4. Run the `Question2` class:
   ```bash
   java Solution.Question2
   ```

## Example Usage

1. Launch the application.
2. Select an event type (Musical or Sport Game).
3. Enter the number of tickets.
4. Click "Show Booking" to view the event details and total cost.

---
