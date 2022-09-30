# gradle-demo
Demo for Gradle knowledge sharing

```bash
./gradlew eat      
root eat
dog eat

./gradlew sleep
root sleep
cat sleep

./gradlew dog:eat
dog eat

./gradlew cat:eat
FAILURE: Build failed with an exception.
* What went wrong:
Task 'eat' not found in project ':cat'.

./gradlew dog:sleep
FAILURE: Build failed with an exception.
* What went wrong:
Task 'sleep' not found in project ':dog'.

./gradlew cat:sleep
cat sleep

./gradlew :eat     
root eat

./gradlew :sleep   
root sleep
```