/**
 * 
 */
package com.javalec.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author user
 *
 */
public interface BCommand {
	void execute(HttpServletRequest request, HttpServletResponse response);
	
}