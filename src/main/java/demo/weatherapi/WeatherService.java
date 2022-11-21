package demo.weatherapi;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {
    private final WeatherEndpoint weatherEndpoint;

    public WeatherService(WeatherEndpoint weatherEndpoint) {
        this.weatherEndpoint = weatherEndpoint;
    }

    public Mono<WeatherDTO> getWeatherDataForAWeek() {
        return weatherEndpoint.getWeatherDataForAWeek();
    }
}
