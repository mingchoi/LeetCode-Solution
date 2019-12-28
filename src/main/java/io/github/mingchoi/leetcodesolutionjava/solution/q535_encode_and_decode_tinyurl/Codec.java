package io.github.mingchoi.leetcodesolutionjava.solution.q535_encode_and_decode_tinyurl;

import java.util.HashMap;

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Encode and Decode TinyURL.
Memory Usage: 36 MB, less than 100.00% of Java online submissions for Encode and Decode TinyURL.
 */
public class Codec {
    HashMap<String, String> map = new HashMap<>();

    public String encode(String longUrl) {
        String hash = String.valueOf(longUrl.hashCode());
        map.put(hash, longUrl);
        return hash;
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
