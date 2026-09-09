Activity 2

Restaurant Menu Item

Guide Questions

4. Which input values require nextLine()?

- In this program, I would use `nextLine()` for the food item and category. Both inputs may be composed of more than one word, so the method needs to read the spaces together with the rest of the text.

5. Why is double preferred over int for the price?

- A price is better stored as a `double` because it may include centavo values. If I used an `int`, a price such as 95.75 could not be stored completely because an `int` only accepts whole numbers.

6. What is the difference between a variable name and a Java keyword?

- From how I understand it, a variable name is a name I choose for a specific piece of data in my program, while a Java keyword already has a fixed meaning in the language. For example, I can use `foodItem` as a variable name, but `double` is a keyword that Java uses to declare a decimal data type.
