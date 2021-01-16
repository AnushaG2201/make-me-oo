Problems with Shivam's OOP solution:
        The Point class doesn't have any behvaiour of its own.
        The DistanceAndDirectionCalculator class doesn't have any fields of its own.
        This breaks the encapsulation in both the classes.
        The constructors and setters are not used in the Points class.


Solution:
        Use a single class with both behaviour and fields of Points.
        Remove the getters and setters.
        Thus Points class will be well encapsulated.
