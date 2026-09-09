Activity 1

University Student Profile

Guide Questions

1. Why should the student number be stored as a String instead of an int?
- At first, a student number may look like a regular number, but I would store it as a String because it can contain a hyphen and leading zeroes. I also would not use it for any calculation since its purpose is only to identify a student.

2. Which Scanner method is appropriate for reading a full name with spaces?
- For a full name, I would use `nextLine()` because it reads everything entered on the line, including the spaces between the first, middle, and last name.

3. What Java data type is appropriate for GPA, and why?
- Since a GPA is not always a whole number, I would use the `double` data type. It allows the program to store decimal values such as 3.25 or 3.75 without removing the fractional part.
