# NumberGame
Numbers displayed in sequence. Specific numbers will be replaced by a text based on a given set of number functions.

**Run All Tests:**
mvn test

_NumberGame: class_
This has methods for stage 1 and stage 2 requirements.

The unit test _NumberGameTest_ will print all the values fro 1 to 100 as per the requirement.

**Implementation Details:**

Stage 1:
- Processor Factory returns the class for stage 1.
- This class checks for divisible numbers.

Stage 2:
- Processor Factory returns the class for stage 2.
- This class checks for divisible numbers and for digit present

Numbers:
The numbers that are to be printed with a custom text will have its own implementation.
For e.g. number 3 will be printed as Fizz.
The implementation will override methods from interfaces divisible and divisibleOrDigitPresent.

**NOTE:**

- A new number e.g.7 can be added just by having a new implmentation and extending appropriate interfaces. Add this to the main numbers list in class NumberGame.
- A new function e.g. mod (%) can be implemented just be creating a new interface and having the respective number class implement it. A new processor has to be defined for this interface.
- Processor will select only the numbers that has the corresponding interface implemented, validates it and return the text accordingly. 

.

