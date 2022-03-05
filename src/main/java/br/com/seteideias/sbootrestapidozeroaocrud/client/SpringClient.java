package br.com.seteideias.sbootrestapidozeroaocrud.client;

import br.com.seteideias.sbootrestapidozeroaocrud.entity.Book;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Log4j2
public class SpringClient {

    public static void main(String[] args) {

        ResponseEntity<Object> exchange = new RestTemplate().exchange("http://localhost:8080/book/1", HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });
//        Book forObject = new RestTemplate().getForObject("http://localhost:8080/book/1", Book.class);
        log.info("Retorno -> {}", exchange);

    }

}
