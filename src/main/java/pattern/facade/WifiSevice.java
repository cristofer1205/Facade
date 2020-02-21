package pattern.facade;

public class WifiSevice implements MobileService {
    public void start() {
        System.out.println("WIFI Service started");
    }

    public void close() {
        System.out.println("WIFI Service started");
    }
}
