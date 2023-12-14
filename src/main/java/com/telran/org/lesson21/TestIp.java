package com.telran.org.lesson21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestIp {

    public static void main(String[] args) {
        //IP - A.B.C.D - 0 - 255
        //[0-9], \d{1, 2}, \d{2}
        // not acceptable [0-255]
        // zeroTo255.zeroTo255.zeroTo255.zeroTo255
        // 1, 11, 111 : 0 - 255
        // [0-9] | [10-99] | [100-255]
        // 1, 24, 34, 55, 7, 9

        // [100 -199] - "1"\d{2},
        // [200 -249] - 2[0-4][0-9]
        // [250 - 255] - 25[0-5]

        // \d{1,2} | (0|1)\d{2} | 2[0-4][0-9] | 25[0-5]
        String regex = "(\\d{1,2}|(0|1)\\d{2}|2[0-4][0-9]|25[0-5])";

        String ip1 = "000.14.22.135";
        System.out.println("Is ip " + ip1 + " valid = " + isValidIpAddress(regex, ip1));
        String ip2 = "0.0.0.0";
        System.out.println("Is ip " + ip2 + " valid = " + isValidIpAddress(regex, ip2));

        String ip3 = "00.1.24.24.24";
        System.out.println("Is ip " + ip3 + " valid = " + isValidIpAddress(regex, ip3));

        String ip4 = "i.am.not.an.ip";
        System.out.println("Is ip " + ip4 + " valid = " + isValidIpAddress(regex, ip4));
    }
    private static boolean isValidIpAddress(String regex, String address) {
        if(address == null) {
            return false;
        }
        String fullRegex = regex + "\\." + regex + "\\." + regex + "\\." + regex;
        Pattern pattern = Pattern.compile(fullRegex);
        Matcher matcher = pattern.matcher(address);
        return  matcher.matches();

    }
}
