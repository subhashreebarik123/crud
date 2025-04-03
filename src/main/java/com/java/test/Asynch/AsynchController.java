package com.java.test.Asynch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AsynchController {

    @Autowired
        private AsynchService asynchService;


        @GetMapping
       public String runAsyncTask() {
            asynchService.asyncMethod();
            return "Async task started!";
        }
      }


