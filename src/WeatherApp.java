public class WeatherApp
{
    public static void main(String[] args)
    {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        // Add Observers
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        // Simulating Weather Change
        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Cloudy");
        weatherStation.setWeather("Windy");

        // Remove an Observer
        weatherStation.removeObserver(phoneDisplay);
        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Cloudy");
        weatherStation.setWeather("Windy");

        // Remove all Observers
        weatherStation.removeObserver(tvDisplay);
        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Cloudy");
        weatherStation.setWeather("Windy");
    }
}
