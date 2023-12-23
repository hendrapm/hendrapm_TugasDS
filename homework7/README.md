# API Testing Using Karate Framework

---

Homework 7 Automation API Testing
by: Hendra PM (hendrapm)

---

### For Running on the Console
- Run tests runner by className
 ```
  - mvn clean test -Dtest=${nameclassjava}
  Example : mvn clean test -DTest=Runner
  ```

- Run parallel all test 
 ```
mvn test "-Dkarate.options=--tags ~${nametag}"
Example : mvn test "-Dkarate.options=--tags selectedtag"
  ```

### Karate Sources
- https://github.com/karatelabs/karate