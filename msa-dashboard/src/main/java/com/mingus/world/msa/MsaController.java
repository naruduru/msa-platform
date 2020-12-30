package com.mingus.world.msa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
@Slf4j
public class MsaController {
    @GetMapping("/test")
    public void test() {
        log.info("1111");
    }
}
