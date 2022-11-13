package PosibleSolution;

public class WeatherTracker {
    private Notificate noticate;

    public WeatherTracker(Notificate Client){
        this.noticate= Client;

    }

    public void setCurrentConditions(String weatherDescription){
        noticate.generarNotificate(weatherDescription);
    }


}
