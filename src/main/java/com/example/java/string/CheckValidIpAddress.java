package com.example.java.string;

public class CheckValidIpAddress {
    public static void main(String[] args) {
        String ip1 = "168.22.45.1";
        String ip2 = "168.22.45.01";
        String ip3 = "258.22.45.1";
        String ip4 = "168.22.05.1";
        System.out.println(checkValidIp(ip1));
        System.out.println(checkValidIp(ip2));
        System.out.println(checkValidIp(ip3));
        System.out.println(checkValidIp(ip4));
    }

    private static boolean checkValidIp(String ip1) {

        String[] octets = ip1.split("\\.");

        if (octets.length != 4)
            return false;

        for (String octet : octets) {
            if (octet.startsWith("0"))
                return false;

            int value = Integer.parseInt(octet);
            if (value < 1 || value > 255)
                return false;
        }
        return true;
    }
}
