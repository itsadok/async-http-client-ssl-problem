package com.buzzilla;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.ning.http.client.*;
import java.util.concurrent.Future;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() throws Exception
    {
        try {
            AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
            Future<Response> f = asyncHttpClient.prepareGet("https://ws.plimus.com/").execute();
            Response r = f.get();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
