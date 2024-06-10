package Ex6;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ContentStrategy implements Strategy{
    @Override
    public boolean check(String url1, String url2) {
        try {
            int size1 = getContentSize(url1);
            int size2 = getContentSize(url2);
            return size1 == size2;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private int getContentSize(String _url) throws IOException {
        URL url = new URL(_url);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("HEAD");
        return conn.getContentLength();
    }
}
