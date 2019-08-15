# Query fails if SLAVE_OK is added

Add the anotation `@Meta(flags = CursorOption.SLAVE_OK)` to a repository method makes the query fail with `java.lang.IllegalArgumentException: SLAVE_OK is no supported flag`.
The expected behavior is documented at https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#mongo.query.additional-query-options
