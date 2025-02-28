**Overview**

This project demonstrates the implementation of two essential design patterns in Java: the Builder pattern and the **Prototype** pattern. 

The project is centered around constructing a complex object—a **Dungeon**—which comprises multiple Rooms and NPCs (Non-Player Characters).

**Features**

**Builder Pattern:**

Provides a step-by-step approach to constructing a Dungeon object. 

The builder allows you to set the dungeon's name, add various rooms, and include NPCs, culminating in the creation of a fully configured dungeon.

**Prototype Pattern:**

Implements cloning functionality for game entities such as Room and NPC. 

This pattern enables you to easily create copies of an object, which is especially useful for quickly generating multiple similar rooms or characters.

**Combined Implementation:**

The project also demonstrates how to integrate both patterns. 

A combined demo shows how to build a dungeon using the builder pattern and then use the prototype pattern to clone a room multiple times, applying small modifications to each clone.

**Project Structure**

IDungeonBuilder.java: Interface defining methods for building a Dungeon.

SimpleDungeonBuilder.java: Concrete implementation of IDungeonBuilder that assembles the Dungeon object.

Dungeon.java: The product class representing the final dungeon with its name, rooms, and NPCs.

CloneableGameEntity.java: Interface for entities that can be cloned.

Room.java: Class representing a room in the dungeon; implements the Prototype pattern.

NPC.java: Class representing a non-player character; implements the Prototype pattern.

MUDBuilderDemo.java: Demonstrates the use of the builder pattern to create a dungeon.

MUDPrototypeDemo.java: Demonstrates the use of the prototype pattern to clone rooms.

MUDCombinedDemo.java: Shows a combined demonstration where the builder and prototype patterns are used together to extend the dungeon.

MUDBuilderDemo.java Output:
![image](https://github.com/user-attachments/assets/555ae063-80f6-4cb0-9cea-e5ed3c61932d)

MUDPrototypeDemo.java Output:
![image](https://github.com/user-attachments/assets/ad9c0664-cadd-442d-9d3f-94e405a3cdc5)

MUDCombinedDemo.java Output:
![image](https://github.com/user-attachments/assets/76521470-de29-46eb-8aea-ed88eef18e98)





