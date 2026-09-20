Why does changing s1 not automatically change s2?

Changing s1 does not automatically change s2 because s1 and s2 are two separate objects created from the same Student class. Each object has its own copy of the instance fields, so changing the values of s1 does not affect the values of s2.

Which part of the program is shared by all Student objects, and which values belong to each individual object?

The Student class and its methods, such as printSummary() and addCredits(), are defined in the class and are available to all Student objects. The values of id, name, and completedCredits belong to each individual Student object. Therefore, s1 and s2 can have different values for these fields.
