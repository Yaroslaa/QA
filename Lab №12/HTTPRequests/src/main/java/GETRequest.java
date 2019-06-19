import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GETRequest {
    private final static Logger LOG = LogManager.getLogger(GETRequest.class);
    private HttpURLConnection connection;
    public static void main(String[] args) throws IOException {
        GETRequest request = new GETRequest();
        String query = "http://localhost:8080/EE_war_exploded/";
        LOG.info(request.createGETRequest(query));
    }
    public String createGETRequest(String query) throws IOException {
        StringBuilder builder = new StringBuilder();
        connection = (HttpURLConnection) new URL(query).openConnection();
        connection.setRequestMethod("GET");
        connection.setUseCaches(false);
        connection.setConnectTimeout(2500);
        connection.setReadTimeout(2500);
        connection.connect();

        if (checkResponseCode()) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append("\n");
            }
        } else {
            builder = new StringBuilder(); // пустая строка
        }
        return builder.toString();
    }
    public boolean checkResponseCode() throws IOException {
        LOG.info(HttpURLConnection.HTTP_OK == connection.getResponseCode() ? "OK" : "ERROR.. code = " + connection.getResponseCode());
        return HttpURLConnection.HTTP_OK == connection.getResponseCode();
    }
}