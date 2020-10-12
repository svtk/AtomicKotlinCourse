# AtomicKotlinCourse

If you want to use the text version of the exercises and solutions (rather than the EDU version 
that runs inside IntelliJ IDEA):

- Download and unpack [the current release](https://github.com/svtk/AtomicKotlinCourse/releases/tag/v5.0)

- To check output and 'eq' for examples and exercise solutions, run `gradlew TestExamples`.

- To test the exercises against their given solutions, run `gradlew TestExercises`.

## To use in developer mode:

After cloning, open as a project in Intellij IDEA with the EDU extension installed.

When you make changes, you might need to rerun Gradle to build the project:

```
gradlew build -x test
```
