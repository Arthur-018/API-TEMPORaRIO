package com.valorant.service;




import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

@Component
public class ApiClient {

    private final WebClient webClient;
    private final String ENDERECO = "https://valorant-api.com/v1";
    public ApiClient() {
        ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(configurer -> configurer
                        .defaultCodecs()
                        .maxInMemorySize(16 * 1024 * 1024))
                .build();

        this.webClient = WebClient.builder()
                .baseUrl("https://valorant-api.com/v1")
                .clientConnector(new ReactorClientHttpConnector(HttpClient.create()))
                .exchangeStrategies(strategies)
                .build();
    }

    public <T> T get(String endpoint, Class<T> responseType) {
        try {
            return webClient.get()
                    .uri(endpoint)
                    .retrieve()
                    .bodyToMono(responseType)
                    .block();
        } catch (Exception e) {
            System.out.println("Erro ao acessar endpoint " + endpoint + ": " + e.getMessage());
            return null;
        }
    }
}
