package pattern.facade;

public class ClientFacadePattern {
    public static void main(String[] args) {

        MobileFacade facade = new MobileFacade();
        Mobile mobile = facade.on();

        System.out.println("---------------");

        facade.off(mobile);
    }
}
