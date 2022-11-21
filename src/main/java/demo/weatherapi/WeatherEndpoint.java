package demo.weatherapi;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherEndpoint {
    private final WebClient webClient;

    public WeatherEndpoint(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<WeatherDTO> getWeatherDataForAWeek() {
        return webClient.get()
                .retrieve()
                .bodyToMono(WeatherDTO.class);
    }

}
