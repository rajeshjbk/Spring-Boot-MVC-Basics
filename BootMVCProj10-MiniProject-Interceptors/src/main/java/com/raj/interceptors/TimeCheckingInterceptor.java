package com.raj.interceptors;

import java.time.LocalTime;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class TimeCheckingInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest req,
			HttpServletResponse res, 
			Object handler) throws Exception {

		if(!req.getServletPath().equals("/")) {

			//get System Time
			LocalTime time  = LocalTime.now();

			//get current hour of the day
			int hour = time.getHour();

			if(hour<9 || hour>17) {

				RequestDispatcher rd = req.getRequestDispatcher("/timeout.jsp");
				rd.forward(req, res);
				return false;
			}
		}
		return true;
	}
}
