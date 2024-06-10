package Ex6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TextStrategy implements Strategy{
    @Override
    public boolean check(String url1, String url2) {
        try {
            String text1 = getTextContent(url1);
            String text2 = getTextContent(url2);
            return text1.equals(text2);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private String getTextContent(String _url) throws Exception {
        URL url = new URL(_url);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder content = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        return content.toString().replaceAll("<[^>]*>", "");
    }
}
