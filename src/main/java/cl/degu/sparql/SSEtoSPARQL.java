package cl.degu.sparql;

import org.apache.jena.query.Query;
import org.apache.jena.sparql.algebra.OpAsQuery;
import org.apache.jena.sparql.algebra.Algebra;

public class SSEtoSPARQL {
    public static Query translate(String sse) {
        return OpAsQuery.asQuery(Algebra.parse(sse));
    }
}
