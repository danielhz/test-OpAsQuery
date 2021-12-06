package cl.degu.sparql;

import org.apache.jena.sys.JenaSystem;

/**
 * Write examples for translating from SSE to SPARQL
 */
public class App
{
    public static void main( String[] args )
    {
        JenaSystem.init();
        String sse;

        sse = "(project ?s (bgp (triple ?s ?p ?c)))";
        System.out.println(SSEtoSPARQL.translate(sse));

        sse = "(project ?s (bgp (triple ?s <http://example.org> ?c)))";
        System.out.println(SSEtoSPARQL.translate(sse));
    }
}
