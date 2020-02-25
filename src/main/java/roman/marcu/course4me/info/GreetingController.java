/*
 * Copyright (c) 2017 CRF Box Oy. All Rights Reserved. Company Confidential.
 */
package roman.marcu.course4me.info;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CRF Health
 */
@RestController
public class GreetingController {

    @GetMapping("say-hello")
    public String sayHello(){
        return "Hello World !!!";
    }
}
