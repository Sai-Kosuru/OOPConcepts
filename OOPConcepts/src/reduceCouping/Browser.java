package reduceCouping;

public class Browser {
    public void navigate(String ipAddress){
        String ip = findIpAdress(ipAddress);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html> Hello </html>";
    }

    private String findIpAdress(String ipAddress) {
        return "127.123.143";
    }
}
