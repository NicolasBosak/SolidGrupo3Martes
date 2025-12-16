package ISP.After;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.turnOn();
        phone.charge();
        Switchable camera = new DisposableCamera();
        camera.turnOn();
        System.out.println("Ejecución finalizada sin errores.");
    }
}
