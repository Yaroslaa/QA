import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GETRequestTest {

    private GETRequest request = new GETRequest();
    private String query = "http://localhost:8080/EE_war_exploded/";

    @Test
    public void testCheckContainsHTMLTag() throws IOException {
        String result = request.createGETRequest(query);
        Assert.assertTrue(result.contains("<html>"));
    }

    @Test
    public void testCheckResponseCode() throws IOException {
        request.createGETRequest(query);
        Assert.assertTrue(request.checkResponseCode());
    }

    @Test
    public void testGETRequest() throws IOException {
        Assert.assertFalse(request.createGETRequest(query).isEmpty());
    }

}