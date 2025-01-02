# Improper Exception Handling in Scala Setter Method

This repository demonstrates a common error in Scala:  inadequate exception handling within a setter method. The example shows a `MyClass` with a `value` property that throws an `IllegalArgumentException` if a negative value is assigned. However, it doesn't comprehensively handle exceptions that may arise from other actions within the setter.