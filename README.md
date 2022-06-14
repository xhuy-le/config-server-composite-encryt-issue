# Read Me First
In this sample project, the property `spring.cloud.config.server.bootstrap` is set to `true` to force the config server to locate its configuration properties. Open a console, go to the project folder and launch the JUnit test:

```
gradle clean test --info
```

The test will fail as the config server is not able to decrypt `spring.cloud.config.server.native.search-locations`. If the property `spring.cloud.config.server.native.search-locations` was in plain text (`file:config`), the test would pass successfully.

