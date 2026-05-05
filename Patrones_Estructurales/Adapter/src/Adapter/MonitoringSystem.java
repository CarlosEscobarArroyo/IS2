package Adapter;
public class MonitoringSystem {
    private LegacyEmailLib emailService;
    private FastSMSAdaptee smsService;
    
    private int notificationType = 0;

    public MonitoringSystem() {
        this.emailService = new LegacyEmailLib();
        this.smsService = new FastSMSAdaptee();
    }

    public void processAlerts() {
        
        if (notificationType == 0) {

            emailService.sendEmail("carlos.escobar@ferreycorp.com.pe", 
                "Titulo",
                "Hola!!");
        } else {
            smsService.sendInstantMessage("950538202", "Hola!!");
        }   
    }


    
}
