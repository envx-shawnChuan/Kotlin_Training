# Kotlin Training

A Kotlin adaptation of `Python_Training`, organized as a progression of small command-line exercises. Each exercise is an independent `Main.kt` program under `ModuleX/exYY/`.

## Prerequisites

- JDK 21
- Maven 3.9+

No dependencies beyond the Kotlin standard library are used by the exercises.

## Run an exercise

Compile all exercises:

```powershell
mvn compile
```

Then run an exercise by its generated Kotlin class name. For example:

```powershell
kotlin -classpath target/classes module0.ex02.MainKt
```

Programs that accept input read it from standard input; programs that accept parameters use normal command-line arguments.

## Verify

```powershell
mvn verify
```

## CI/CD

GitHub Actions runs the Maven verification pipeline for every push and pull request. A separate CodeQL workflow scans Kotlin source on pushes, pull requests, and a weekly schedule.

## License

This project is released under the [MIT License](LICENSE).