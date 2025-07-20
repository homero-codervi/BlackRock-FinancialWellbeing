package com.blk.auto_ahorro.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController {

        @RequestMapping("/error")
        public String handleError(HttpServletRequest request) {
            Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

            if (status != null && status.toString().equals("404")) {
                return "❌ Error 404: This path does not exist.";
            }

            return "⚠️ Something went wrong.";
        }
}
