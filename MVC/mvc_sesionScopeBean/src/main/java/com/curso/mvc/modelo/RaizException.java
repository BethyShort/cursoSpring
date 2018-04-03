package com.curso.mvc.modelo;


	 public class RaizException extends Exception {
	 
	 	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String msg;
		 
		
		public RaizException(){
			msg = "No hay soluci�n, ra�z no v�lida";
		}
		
		
		public String getMessage(){ return msg; }
	} 