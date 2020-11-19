# Unit 3-1 — JAVA 数组

## Description
In this assignment, you will finish the implementation of `ProjectArray`, a class with static methods for creating, analyzing, and manipulating arrays of `Project` objects. iCarnegie provides a test driver and the class `Project`.
## Class
### `Project`
A complete implementation of this class is included in the student archive `student-files.zip`. Stop now and review its documentation:
- `Project.html`. Documentation for class `Project`.

### `ProjectArray`
A partial implementation of this class is included in the student archive `student-files.zip`. You should complete the implementation of every method in this class. 

### `TestProjectArray`
This class is a test driver for class `ProjectArray`. It contains test cases for every method in the class. A complete implementation is included in the student archive `student-files.zip`. You should use this class to test your implementation of `ProjectArray`.

## Files
The following files are needed to complete this assignment: 
- `student-files.zip`. Download this file. This archive contains the following: 
    - `Project.java`. A complete implementation.
    - `ProjectArray.java`. Use this template to complete your implementation. 
    - `TestProjectArray.java`. A complete implementation.

## Tasks 
Implement all methods in class `ProjectArray`. Follow Sun's code conventions. The following steps will guide you through this assignment. Work incrementally and test each increment. Save often.

1. Extract the files by issuing the following command at the command prompt: 
```
C:\>unzip `student-files.zip` 
```

2. Test each method as soon as you finish writing it by issuing the following command at the command prompt: 
```
C:\>java TestProjectArray 
```

3. Implement the method makeArray. 
    - `public static Project[] makeArray(Project first, Project second, Project third)`. 
    
    This method takes three `Project` objects and returns an `Project` array with three elements. The first element of the array contains a reference to the first argument; the second element contains a reference to the second argument; and the third element contains a reference to the third argument. 

    For example, consider the following objects:
        - `Project[102, cruise, 68250.0]`
        - `Project[101, domestic, 36000.0]`
        - `Project[103, outbound, 92175.0]`
    
    If these objects are passed to makeArray in the indicated order, makeArray will return the following array:
    ```
    { Project[102,cruise,68250.0],
    Project[101,domestic,36000.0],
    Project[103,outbound,92175.0]}
    ```

    Note: `Project[ID, name, price]` is the string representation of an `Project` object. 

4. Implement the method `copyArray`. Use indexes to implement this method. 
    - `public static Project[] copyArray(Project[] array)`. 
    
    This method takes an `Project` array and returns a new array with the same elements in the same order. 

    For example, consider the following array:
    ```
    { Project[102, cruise, 68250.0],
    Project[101, domestic, 36000.0],
    Project[103, outbound, 92175.0]}
    ```

    If copyArray is passed this array, it will return the following array:
    ```
    { Project[102, cruise, 68250.0],
    Project[101, domestic, 36000.0],
    Project[103, outbound, 92175.0]}
    ```

5. Implement the method `getProject`. Use a for-each loop to implement this method. 
    - `public static Project getProject(Project[] array, int id)`. 
    
    This method takes two arguments, an `Project` array and an Project ID, and returns the `Project` object with the specified ID. This method returns null if there are no Projects in the specified array with the specified ID. 

    For example, consider the following array:
    ```
    { Project[102, cruise, 68250.0],
    Project[101, domestic, 36000.0],
    Project[103, outbound, 92175.0]}
    ```

    If `getProject` is passed this array and the integer 103, it will return the `Project` object for outbound. If `getProject`  is passed this array and the integer 222, it will return null. 

6. Implement the method `countLowerPrice`. Use a for-each loop to implement this method. 
    - `public static int countLowerPrice(Project [] array, double amount)`. 
    
    This method takes two arguments, an `Project` array and a dollar amount, and returns the number of Projects in the specified array whose price is lower than the specified dollar amount. 

    For example, consider the following array:
    ```
    { Project[102, cruise, 68250.0],
    Project[101, domestic, 36000.0],
    Project[103, outbound, 92175.0]}
    ```

    If `countLowerPrice` is passed this array and the double 70000.0, it will return 2. If `countLowerPrice` is passed this array and the double 60000.0, it will return 1. 

7. Implement the method `sumPrice`. Use a for-each loop to implement this method. 
    - `public static double sumPrice(Project[] array)`. 
    
    This method takes an `Project` array and returns the sum of the price of the projects in the specified array. 

    For example, consider the following array:
    ```
    { Project[102, cruise, 60000.0],
    Project[101, domestic, 30000.0],
    Project[103, outbound, 90000.0]}
    ```

    If `sumPrice` is passed this array, it will return 180000.0. 

8. Implement the method `getLowestPrice`. Use indexes to implement this method. 
    - `public static double getLowestPrice(Project[] array)`. 
    
    This method takes an `Project` array and returns the lowest price in the specified array. To simplify your code, you can assume that the specified array contains one or more elements. 

    For example, consider the following array:
    ```
    { Project[102, cruise, 60000.0],
    Project[101, domestic, 30000.0],
    Project[103, outbound, 90000.0]}
    ```

    If this array is passed to `getLowestPrice`, it will return 30000.0. 

9. Implement the method `increaseAll`. Use a for-each loop to implement this method. 
    - `public static void increaseAll(Project[] array, double amount)`.

    This method takes two arguments, an `Project` array and a dollar amount, and increases the price of every `Project` in the specified array by the specified amount. 
    For example, consider the following array:
    ```
    { Project[102, cruise, 60000.0],
    Project[101, domestic, 30000.0],
    Project[103, outbound, 90000.0]}
    ```
    If `increaseAll` is passed this array and the integer 1000, the array will be modified as follows:
    ```
    { Project[102, cruise, 61000.0],
    Project[101, domestic, 31000.0],
    Project[103, outbound, 91000.0]}
    ```

10.	Implement the method `displayAll`. Use indexes to implement this method. 
    - `public static String displayAll(Project[] array)`.

    This method takes an `Project` array and returns a string representation of the specified array. To simplify your code, you can assume that every element in the specified array contains a valid reference to an `Project` object. 
    Use the method `toString` in the class `Project` to obtain the string representation of each object in the array. A new line character `\n` should separate the string representations of each Project object.

    For example, consider the following array:
    ```
    {Project[102, cruise, 61000.0],
    Project[101, domestic, 31000.0]}
    ```

    If this array is passed to `displayAll`, the following string will be returned: 
    ```
    Project[102, cruise, 61000.0]\nProject[101, domestic, 31000.0]
    ```

    Note that the string does not end with a new line character `\n`. 

