package com.registration.serv;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registration.cache.CacheDesignSolution;
import com.registration.dao.OptionsDataProviderDao;

@WebServlet("/ViewRegistrationServlet")
public class ViewRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//List<String> cities,states,country;
	//long start ;
	
	/**
	 *Read the values inside init method bcz this method will execute only once in lifecyle events of servlets
	 *
	 */
	
	
	public void init() {
		
	/*	start= System.nanoTime();
		System.out.println("started time  "+start);
		System.out.println("inside init method");
		cities = new ArrayList<String>();
		states = new ArrayList<String>();
		country = new ArrayList<String>();
		
		
		try {
			cities = OptionsDataProviderDao.getCityList();
			states = OptionsDataProviderDao.getStateList();
			country = OptionsDataProviderDao.getCountryList();
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		
	}
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<String> cities,states,country;
		long start =System.nanoTime();
		
		System.out.println("inside service method");
		CacheDesignSolution cDesignSolutuion = CacheDesignSolution.getInstance();
		System.out.println(cDesignSolutuion);
		System.out.println("--------------------->"+cDesignSolutuion.containsKey("cities"));
		if((cDesignSolutuion.containsKey("cities") && cDesignSolutuion.containsKey("states") && cDesignSolutuion.containsKey("country")) == false) {
			System.out.println("inside service if block");
			System.out.println("inside init method");
			cities = new ArrayList<String>();
			states = new ArrayList<String>();
			country = new ArrayList<String>();	
			try {
				cities = OptionsDataProviderDao.getCityList();
				states = OptionsDataProviderDao.getStateList();
				country = OptionsDataProviderDao.getCountryList();
				
				cDesignSolutuion.put("cities",cities);
				cDesignSolutuion.put("states",states);
				cDesignSolutuion.put("country",country);
				
				/*request.setAttribute("cities", cities);
				request.setAttribute("states", states);
				request.setAttribute("country", country);*/
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("inside service else block");
			/*request.setAttribute("cities", cDesignSolutuion.get("cities"));
			request.setAttribute("states", cDesignSolutuion.get("states"));
			request.setAttribute("country", cDesignSolutuion.get("country"));*/
		   }
		System.out.println("started time  "+start);
		request.setAttribute("cities", cDesignSolutuion.get("cities"));
		request.setAttribute("states", cDesignSolutuion.get("states"));
		request.setAttribute("country", cDesignSolutuion.get("country"));
		request.setAttribute("startTime", start);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Registration.jsp");
		requestDispatcher.forward(request, response);
		
		
		/*//this is for init method
		request.setAttribute("cities", cities);
		request.setAttribute("states", states);
		request.setAttribute("country", country);
		request.setAttribute("startTime", start);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Registration.jsp");
		requestDispatcher.forward(request, response);*/
	}

}
