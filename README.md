# Java Fundamentals — Practical 01

Java console exercises for the SE2012 practical.

## Exercises

| Source file | Purpose |
| --- | --- |
| `src/Welcome.java` | Read a first and last name and display a welcome message |
| `src/Question_2.java` | Work with student marks and summary calculations |
| `src/Question_3_Q2Updated.java` | Extend the marks exercise with grade reporting |

The original practical instructions and study notes are preserved in [docs/practical-notes.md](docs/practical-notes.md).

## Requirements

A JDK with `java` and `javac` available in your terminal.

## Compile and run

From the repository root:

```sh
javac -d build src/Welcome.java src/Question_2.java src/Question_3_Q2Updated.java
java -cp build Welcome
```

To run another exercise:

```sh
java -cp build Question_2
java -cp build Question_3_Q2Updated
```

## Structure

```text
src/                  # Java source files
docs/
  practical-notes.md   # Original assignment and learning notes
build/                # Generated classes; ignored by Git
```
