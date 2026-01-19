# Capgemini Java Training - Core Java Learning Repository

A comprehensive Java learning repository covering fundamental to advanced core Java concepts through practical examples and assignments.

## 📚 Project Structure

```
Core_java/
├── src/                          # Source code directory
│   ├── module-info.java         # Module definition (for module system)
│   ├── _pr/                     # Practice exercises
│   ├── array/                   # Array operations and algorithms
│   ├── conditional/             # Conditional statements (if-else, switch)
│   ├── constructor/             # Constructor concepts and chaining
│   ├── exam/                    # Exam-related practice
│   ├── interfaceclass/          # Interface implementations
│   ├── java_core/               # Core Java fundamentals
│   ├── loop/                    # Loop structures (while, do-while)
│   ├── loop_assignment/         # Loop-based assignments
│   ├── method_assignment/       # Method-focused assignments
│   ├── methods/                 # Method concepts and declarations
│   ├── object_creation/         # Object instantiation patterns
│   ├── oops/                    # Object-Oriented Programming
│   │   ├── abstraction/         # Abstract classes and methods
│   │   ├── inheritance/         # Inheritance concepts
│   │   └── polymorphism/        # Method overloading and overriding
│   ├── operator/                # Operator usage and precedence
│   ├── operator_assignment/     # Operator-based assignments
│   ├── pattern/                 # Pattern printing programs
│   ├── scanner_class/           # Input handling with Scanner
│   ├── static_method/           # Static methods and variables
│   ├── studentmanagementsystem/ # Student management project
│   ├── supercall/               # Super keyword usage
│   ├── twodimensionalarray/     # 2D array operations
│   ├── typecasting/             # Type casting concepts
│   ├── upcastdowncast/          # Upcasting and downcasting
│   └── relationship/            # Class relationships
└── bin/                          # Compiled bytecode directory
```

## 📖 Topics Covered

### **Fundamentals**

- **Java Core** (`java_core/`) - Basic Java syntax, operators, and concepts
- **Conditional Statements** (`conditional/`) - if-else, switch-case logic
- **Loops** (`loop/`, `loop_assignment/`) - while, do-while, for loops
- **Operators** (`operator/`, `operator_assignment/`) - Arithmetic, logical, bitwise operations

### **Object-Oriented Programming (OOP)**

- **Constructors** (`constructor/`) - Constructor overloading and chaining
- **Methods** (`methods/`, `method_assignment/`) - Method definition, parameters, return types
- **Static Methods** (`static_method/`) - Class-level methods and variables
- **OOPS Concepts** (`oops/`) - Complete OOP principles:
  - **Abstraction** - Abstract classes and interfaces
  - **Inheritance** - Class hierarchies and extension
  - **Polymorphism** - Method overloading and overriding
- **Type Casting** (`typecasting/`, `upcastdowncast/`) - Object type conversions
- **Relationships** (`relationship/`) - Class relationships and dependencies
- **Super Keyword** (`supercall/`) - Parent class method and constructor calls

### **Data Structures & Algorithms**

- **Arrays** (`array/`) - Array operations, searching, sorting
- **2D Arrays** (`twodimensionalarray/`) - Matrix operations
- **Patterns** (`pattern/`) - Pattern printing programs

### **Input/Output & Advanced Topics**

- **Scanner Class** (`scanner_class/`) - User input handling
- **Interface Implementation** (`interfaceclass/`) - Interface concepts
- **Object Creation** (`object_creation/`) - Different object instantiation methods
- **Student Management System** (`studentmanagementsystem/`) - Real-world project example

### **Assignments & Practice**

- **Practice Exercises** (`_pr/`) - General practice programs
- **Exam Preparation** (`exam/`) - Exam-related problems

## 🚀 How to Use This Repository

### **Setup & Compilation**

1. Navigate to the `Core_java` directory
2. Compile the project using:
   ```bash
   javac -d bin src/**/*.java
   ```
3. Run a specific program:
   ```bash
   java -cp bin <package.ClassName>
   ```
   Example:
   ```bash
   java -cp bin array.Basic
   java -cp bin conditional.Calculator
   java -cp bin oops.abstraction.AbstractExample
   ```

### **Learning Path**

Follow this recommended order for structured learning:

1. **Week 1-2:** Java Fundamentals
   - Start with `java_core/`
   - Move to `conditional/` and `loop/`
2. **Week 3:** Operators & Type System

   - `operator/` - Understand operator precedence
   - `typecasting/` - Learn type conversions

3. **Week 4:** Methods & Functions

   - `methods/` - Function concepts
   - `method_assignment/` - Practice problems

4. **Week 5-6:** Object-Oriented Programming

   - `constructor/` - Class initialization
   - `oops/abstraction/` - Abstract concepts
   - `oops/inheritance/` - Class hierarchies
   - `oops/polymorphism/` - Method overriding
   - `upcastdowncast/` - Object casting

5. **Week 7:** Advanced Topics

   - `scanner_class/` - Input handling
   - `interfaceclass/` - Interface implementation
   - `static_method/` - Class-level members

6. **Week 8:** Application Development

   - `studentmanagementsystem/` - Build a real project
   - `object_creation/` - Different instantiation patterns

7. **Ongoing:** Data Structures & Algorithms
   - `array/` - Array operations
   - `twodimensionalarray/` - Matrix problems
   - `pattern/` - Pattern printing

## 📝 Assignment Categories

### Loop Assignments (`loop_assignment/`)

- `CountNumberDivider.java` - Count divisors of a number
- `FindSum.java` - Sum calculation
- `PrimeNumber.java` - Prime number validation
- `q1.java` through `q6.java` - Miscellaneous problems

### Method Assignments (`method_assignment/`)

- `BinaryToDecimal.java` - Binary conversion
- `DecimalToBinary.java`, `DecimalToHexadecimal.java`, `DecimalToOctal.java` - Number system conversions
- `Palindrome.java` - Palindrome checking
- `StrongNumber.java`, `HappyNumber.java`, `DisariumNum.java` - Special number types
- `LeapYear.java` - Date calculations

### Operator Assignments (`operator_assignment/`)

- Various operator precedence and evaluation problems

## 🔧 Technologies & Tools

- **Language:** Java
- **Compiler:** JDK (Java Development Kit)
- **IDE Recommendations:** IntelliJ IDEA, Eclipse, or VS Code with Java extensions
- **Build:** Manual compilation via javac

## 📚 Key Concepts by Module

| Module                     | Key Concepts                                          |
| -------------------------- | ----------------------------------------------------- |
| `array/`                   | Searching, sorting, merging, duplicate removal        |
| `conditional/`             | if-else chains, switch-case statements                |
| `oops/`                    | Encapsulation, abstraction, inheritance, polymorphism |
| `pattern/`                 | Nested loops, string manipulation                     |
| `studentmanagementsystem/` | Real-world application design                         |
| `method_assignment/`       | Number theory, algorithms, validation                 |

## 💡 Tips for Success

1. **Start with Fundamentals** - Ensure you understand Java basics before moving to OOP
2. **Practice Regularly** - Work through assignments in each category
3. **Understand Concepts** - Don't just memorize code; understand why things work
4. **Debug Actively** - Use print statements and debuggers to trace execution
5. **Review Solutions** - Compare your solutions with the provided code
6. **Build Projects** - Apply learning in projects like `studentmanagementsystem/`

## 📌 Quick Reference

### Common Compilation Commands

```bash
# Compile all Java files
javac -d bin src/**/*.java

# Compile specific package
javac -d bin src/array/*.java

# Run a program
java -cp bin array.Basic

# Run with module system
java -p bin -m javamodule/array.Basic
```

### Running Example Programs

```bash
# Array operations
java -cp bin array.ReverseArray

# Conditional logic
java -cp bin conditional.Calculator

# OOP concepts
java -cp bin oops.inheritance.Demo

# Pattern printing
java -cp bin pattern.PyramidPattern
```

## 📞 Support & Resources

- Review comments in source files for additional explanations
- Check package-level organization for related concepts
- Refer to method assignments for algorithm examples
- Study OOPS folder for design pattern implementations

## 📈 Progress Tracking

Mark completed topics:

- [ ] Java Fundamentals
- [ ] Conditionals & Loops
- [ ] Methods & Functions
- [ ] Arrays & Data Structures
- [ ] OOP Basics
- [ ] OOP Advanced (Inheritance, Polymorphism)
- [ ] Interfaces & Abstract Classes
- [ ] Type Casting
- [ ] Input/Output Operations
- [ ] Student Management System Project

---

**Last Updated:** January 2026
**Repository Status:** Active Learning Repository
**Level:** Beginner to Intermediate
