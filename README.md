OOP Module 2 Activities

Name: Amanda Andres  
Assigned Tasks: Module 2 Exercises 1 to 5

Activities

- [Activity 1 - University Student Profile](Activity1)
- [Activity 2 - Restaurant Menu Item](Activity2)
- [Activity 3 - Vehicle Information](Activity3)
- [Activity 4 - Hotel Guest Information](Activity4)
- [Activity 5 - Mobile Phone Record](Activity5)


Final Reflection

61. Which Module 2 topic was easiest for you, and why?

Honestly, using System.out.println() was the easiest for me. I could immediately see if the information I entered was placed under the correct label, so it was easier to follow. It also made me understand how variables work because instead of just declaring them, I could actually see their stored values in the output.

62. Which Java operator was most difficult to understand?

The nested ternary operator confused me the most at first. A regular ternary was still easy to follow, but once another condition was placed inside it, I had to read the expression several times to understand which result belonged to which condition. It was shorter than using multiple statements, but shorter did not automatically mean easier.

63. What common Scanner input mistake did you encounter while working on the exercises?

The mistake I kept watching out for was mixing nextInt() or nextDouble() with nextLine(). Sometimes the program would skip the next text input because Scanner was still reading the leftover Enter key from the previous number. I learned that adding an extra nextLine() after the numerical input clears that leftover line before asking for another String.

64. How did the provided test cases help you debug your programs?

The test cases made me realize that a successful build is not the same as a correct answer. My code could run properly, but I still had to compare the names, values, and formatting with the expected output. They also helped me understand that inputs like 2.50 may appear as 2.5 when stored as a double, but the value is still correct.

65. Which exercise would you improve or extend if control structures were already allowed? Explain briefly.

I would extend the Employee Payroll exercise because simply displaying the employee information feels unfinished. With control structures, I could check whether the employee worked overtime, apply a different rate to the extra hours, and include deductions before showing the final salary. That would make the program feel more like an actual payroll system instead of just a record of employee details.
