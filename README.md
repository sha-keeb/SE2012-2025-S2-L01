# Java Fundamentals

SE2012 Practical 01 coursework covering console input, arrays, marks, and grades.

## Structure

- `src/Welcome.java` — greeting program using console input.
- `src/Question_2.java` — add and update marks; calculate averages and totals.
- `src/Question_3_Q2Updated.java` — marks program extended with grade reporting.
- [Original lab notes](docs/lab-notes.md) — assignment instructions and reference material.

## Compile and run

Install a JDK and run from the repository root:

```sh
javac -d build src/*.java
java -cp build Welcome
java -cp build Question_2
java -cp build Question_3_Q2Updated
```

Run one program at a time. The marks programs expect numeric input, student IDs from 1 to the chosen student count, and subject IDs from 1 to 3.

Compiled classes belong in `build/` and are excluded from version control.
