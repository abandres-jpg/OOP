Activity 3

Vehicle Information

Guide Questions

7. Why is the plate number better stored as String?
- Although a plate number contains digits, I would still store it as a `String` because it can also include letters and spaces. Its purpose is to identify a vehicle, so there is no reason to treat it as a number for calculations.

8. What happens if you use next() instead of nextLine() for a value with spaces?
- If I use `next()`, the program will stop reading once it reaches the first space. For example, entering `ABC 1234` would only save `ABC`, while `nextLine()` would keep the complete plate number.

9. Identify one valid identifier and one invalid identifier you could use in this program.
- One valid identifier I could use is `manufacturingYear` because it follows Java's naming rules and clearly describes the value it holds. An invalid identifier would be `manufacturing-year` because a hyphen is not allowed as part of a Java identifier.
