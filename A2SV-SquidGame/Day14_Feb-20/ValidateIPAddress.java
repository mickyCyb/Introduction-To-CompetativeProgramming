
public class ValidateIPAddress {
    
}
class Solution {
    public String validIPAddress(String queryIP) {
        if(validateIPv4(queryIP)){
            return "IPv4";
        }else if (validateIPv6(queryIP)){
            return "IPv6";
        }
        return "Neither";

    }

    private boolean validateIPv4(String queryIP) {
        if (queryIP.contains(":") || queryIP.startsWith(".") || queryIP.endsWith(".")) {
            return false;
        }

        String[] ip = queryIP.split("\\.");
        if (ip.length != 4) {
            return false;
        }

        for (String p : ip) {
            if (p.length() == 0 || p.length() > 3) {
                return false;
            }
            for (char c : p.toCharArray()) {
                if (Character.isLetter(c)) {
                    return false;
                }
            }
            
            int num = Integer.parseInt(p);
            if (num < 0 || num > 255) {
                return false;
            }
            if (p.length() > 1 && (p.startsWith("0") || p.startsWith("00") || p.equals("000"))) {
                return false;
            }
        }

        return true;
    }

    private boolean validateIPv6(String queryIP) {
        if (queryIP.contains(".") || queryIP.startsWith(":") || queryIP.endsWith(":")) {
            return false;
        }

        String[] ip = queryIP.split(":");
        if (ip.length != 8) {
            return false;
        }

        for (String p : ip) {
            if (p.length() == 0 || p.length() > 4) {
                return false;
            }
            for (char c : p.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (Character.isUpperCase(c) && c > 'F') {
                        return false;
                    }
                    if (Character.isLowerCase(c) && c > 'f') {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}