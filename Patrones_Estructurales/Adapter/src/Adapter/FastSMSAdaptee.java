package Adapter;
public class FastSMSAdaptee {



    public void sendInstantMessage(String phone, String msg) {
        System.out.println("Se enviará un SMS al télefono: " + phone);
    }
}
