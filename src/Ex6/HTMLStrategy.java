package Ex6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTMLStrategy implements Strategy{
    @Override
    public boolean check(String url1, String url2) {
        try {
            String content1 = getHTMLContent(url1);
            String content2 = getHTMLContent(url2);
            return content1.equals(content2);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private String getHTMLContent(String _url) throws Exception {
        URL url = new URL(_url);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder content = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        return content.toString();
    }
}
