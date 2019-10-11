## Summary 1 (#7)

{{ :UNTESTABLE (to some extent) 
Don't really understand what solution is expected. Also, the current test
passes even without any changes: I can only test the produced output (which
doesn't change) }}

Modify `While.kt` to replace the call to `testCondition()` with an inline `++`
increment (remove the increment in the `while` body) and a `Boolean` test,
producing the same output.