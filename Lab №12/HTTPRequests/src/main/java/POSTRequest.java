import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class POSTRequest {

    private final static Logger LOG = LogManager.getLogger(POSTRequest.class);

    public static void main(String[] args) {
        String query = "http://localhost:8080/index.jsp";
        HashMap<String, String> postDataParams = new HashMap<>();
        postDataParams.put("6", "6");
        postDataParams.put("-", "-");
        postDataParams.put("7", "7");
        postDataParams.put("%3D", "%3D");
        LOG.info(performPostCall(query, postDataParams));
    }

    private static String performPostCall(String requestURL, HashMap<String, String> postDataParams) {
        URL url;
        StringBuilder response = new StringBuilder();
        try {
            url = new URL(requestURL);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setReadTimeout(15000);
            connection.setConnectTimeout(15000);
            connection.setRequestMethod("POST");
            connection.setDoInput(true);
            connection.setDoOutput(true);

            OutputStream outputStream = connection.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
            writer.write(getPostDataString(postDataParams));
            writer.flush();
            writer.close();
            outputStream.close();

            int responseCode = connection.getResponseCode();
            LOG.info((responseCode == 200) ? "OK" : "ERROR.. code = " + responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK) {
                String line;
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                    response.append("\n");
                }
            } else {
                response = new StringBuilder();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response.toString();
    }


    private static String getPostDataString(HashMap<String, String> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        boolean isFirst = true;
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (isFirst) isFirst = false;
            else result.append("&");

            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }
        return result.toString();
    }
}
