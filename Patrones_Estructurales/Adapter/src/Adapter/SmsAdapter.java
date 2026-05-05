package Adapter;

public class SmsAdapter implements NotificationTarget {
    
    private FastSMSAdaptee smsService;

    public SmsAdapter(FastSMSAdaptee smsService) {
        this.smsService = smsService;
    }

    @Override
    public void send(String recipient, String content) {
        smsService.sendInstantMessage(recipient, content);
    }
    
}
