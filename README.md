# load-test-framework-with-gatling

```
Objective:

Provide simple, elegant, efficient and powerful tests/framework to analyse performance of APIs
```

## Requirements:

```
java version 17 or above
maven version 3.9.5 or above
gatling version 3.9.5
gatling maven plugin 4.6.0
```

## Usage

```
mvn gatling:test -Dsimulation.class.name=<> -Dsimulation.component=<>
-Dtest.env=qa (optional its defaul in pom.xml)
```