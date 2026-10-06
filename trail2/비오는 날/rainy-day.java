import java.util.Scanner;

class WeatherForecast{
    String date;
    String day;
    String weather;

    public WeatherForecast(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    public String toString(){
        return date + " " + day + " " + weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        WeatherForecast[] wf = new WeatherForecast[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            wf[i] = new WeatherForecast(date, day, weather);
        }

        int idx = -1;
        for (int i = 0; i < n; i++){
            if (wf[i].weather.equals("Rain")){
                if(idx == -1 || wf[i].date.compareTo(wf[idx].date) < 0){
                    idx = i;
                }
            }
        }

        System.out.print(wf[idx]);

    }
}