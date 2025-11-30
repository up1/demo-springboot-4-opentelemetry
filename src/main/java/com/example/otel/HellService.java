package com.example.otel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HellService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HellService.class);

    public void doSth() {
        LOGGER.info("Called doSth()");
    }

}
