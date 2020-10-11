## Mastering the IDE: Analyze Stacktrace

You can automatically navigate to the line where an exception was thrown by
clicking on it in the stacktrace. Run `Task.kt` to see the stacktrace and
navigate to different lines.

You can also analyze the stacktrace copied from another place, such as a bug
tracker. Copy the following stacktrace and call the action
<span class="control">`Analyze stacktrace`</span>:

```text
Exception in thread "main" java.lang.IllegalStateException: something is wrong
    at stacktrace.TaskKt.foo(Task.kt:4)
    at stacktrace.TaskKt.bar(Task.kt:8)
    at stacktrace.TaskKt.main(Task.kt:12)
```
