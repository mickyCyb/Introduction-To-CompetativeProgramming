/**
 * EncodeAndDecodeTinyURL
 */
import java.util.*;

public class EncodeAndDecodeTinyURL {

    public static void main(String[] args) {
        
        Codec codec = new Codec();
        String ans = codec.decode(codec.encode("https://leetcode.com/problems/design-tinyurl"));
        System.out.println(ans);
    }
}

class Codec {

    HashMap<Long,String> urlHashMap = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        
        long hashedUrl = longUrl.hashCode();

        urlHashMap.put(hashedUrl,longUrl);

        return "http://tinyurl.com/problems/" + hashedUrl;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {

        long hash = Long.parseLong(shortUrl.split("/")[4]);
        return urlHashMap.get(hash);
    }
}
