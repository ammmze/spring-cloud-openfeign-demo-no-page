# spring-cloud-openfeign issue with constructing Page object

This repo demonstrates an issue with the spring-cloud-openfeign vanilla configuration for clients using the spring data `Page`.

Clone the repo and run `./mvnw test`

And you should see an error like this:

```
feign.codec.DecodeException: 
Type definition error: [simple type, class org.springframework.data.domain.Page]; nested exception is com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Cannot construct instance of `org.springframework.data.domain.Page` (no Creators, like default construct, exist): abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information
 at [Source: (PushbackInputStream); line: 1, column: 1]
        at com.example.demo.DemoControllerTest.testClient(DemoControllerTest.java:22)
Caused by: org.springframework.http.converter.HttpMessageConversionException: 
Type definition error: [simple type, class org.springframework.data.domain.Page]; nested exception is com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Cannot construct instance of `org.springframework.data.domain.Page` (no Creators, like default construct, exist): abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information
 at [Source: (PushbackInputStream); line: 1, column: 1]
        at com.example.demo.DemoControllerTest.testClient(DemoControllerTest.java:22)
Caused by: com.fasterxml.jackson.databind.exc.InvalidDefinitionException: 
Cannot construct instance of `org.springframework.data.domain.Page` (no Creators, like default construct, exist): abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information
 at [Source: (PushbackInputStream); line: 1, column: 1]
        at com.example.demo.DemoControllerTest.testClient(DemoControllerTest.java:22)

```
