package com.modyo.pokemon.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.modyo.pokemon.config.RestTemplateConfig;
import com.modyo.pokemon.utils.ConstantsEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

@Slf4j
public class BaseServices {

    @Autowired
    protected ObjectMapper mapper;

    @Value("${service.url.base.pokemon.api}")
    protected String urlBasePokemonApi;

    protected Object get(String baseUrl, String uri, Map<String, String> params) throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
        Object response = new Object();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> httpEntity = new HttpEntity<>(headers);
        UriComponents uriComponents  = UriComponentsBuilder
                .fromHttpUrl(baseUrl + uri)
                .build();
        uriComponents = uriComponents.expand(params);
        //log.info(ConstantsEnum.CALLING_TO.getValue() + baseUrl + uri + params);
        RestTemplate restTemplate = new RestTemplateConfig().restTemplate();
        ResponseEntity<Object> requestEntity = restTemplate.exchange(uriComponents.toUriString(), HttpMethod.GET, httpEntity, new ParameterizedTypeReference<Object>() { });
        if(requestEntity.getStatusCode().equals(HttpStatus.OK)) {
            response = requestEntity.getBody();
        }
        return response;
    }

    protected Object get(String urlPomplete) throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
        Object response = new Object();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        //log.info(ConstantsEnum.CALLING_TO.getValue() + urlPomplete);
        RestTemplate restTemplate = new RestTemplateConfig().restTemplate();
        ResponseEntity<Object> requestEntity = restTemplate.exchange(urlPomplete, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<Object>() {	});
        if(requestEntity.getStatusCode().equals(HttpStatus.OK)) {
            response = requestEntity.getBody();
        }
        return response;
    }

}
