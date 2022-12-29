package io.github.mingchoi.leetcodesolutionjava.solution.q535_encode_and_decode_tinyurl;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodecTest {

    @Test
    public void encode() {
        Codec codec = new Codec();
        String url = "https://leetcode.com/problems/design-tinyurl";
        assertEquals(url,
                codec.decode(codec.encode(url)));
    }
}