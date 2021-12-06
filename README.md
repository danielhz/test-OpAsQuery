# test-OpAsQuery

This repository is part of a review of the OpAsQuery function in Jena.
This function translates a S-expression into a SPARQL query.  To
reproduce the review, execute the following instructions:

```
mvn clean package
java -classpath target/provenance-1.0-SNAPSHOT-jar-with-dependencies.jar cl.degu.sparql.App
```
