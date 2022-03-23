package br.com.seteideias.sbootrestapidozeroaocrud.estudo;

import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

@Log4j2
public class Estudo {

    public static void main(String[] args) {

        String orderNumber = "8112588087-1";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("api-key", "e9dd37a003bd880b66ecbb57a8fa87fd57d5af25b0097868965657b76fe52b5e");
        HttpEntity<String> objectHttpEntity = new HttpEntity<>(headers);

        //@formatter:off
//        ResponseEntity<Object> exchange = new RestTemplate().exchange(
//                "https://api.intelipost.com.br/api/v1/shipment_order/" + orderNumber,
//                HttpMethod.GET,
//                objectHttpEntity,
//                new ParameterizedTypeReference<>() { });
        //@formatter:on


//        log.info(exchange.getBody());

    }


}

