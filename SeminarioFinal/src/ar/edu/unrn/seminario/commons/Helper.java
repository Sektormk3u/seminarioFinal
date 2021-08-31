package ar.edu.unrn.seminario.commons;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Helper {
	
	
	private static String FORMATO_FECHA = "dd/M/yyyy";
	private static String FORMATO_FECHA_HORA = "dd/M/yyyy hh:mm:ss";
				
	
	public static String convertDateToString(Date fechaDate) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMATO_FECHA);
		String fechaString = simpleDateFormat.format(fechaDate);
				
		
		return fechaString;
		
	}

	public static String convertDateHourToString(Date fechaDate) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMATO_FECHA_HORA);
		String fechaString = simpleDateFormat.format(fechaDate);
		
				
		return fechaString;
	}
	
	public static Date convertStringToDate(String fechaString) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMATO_FECHA);
		Date fechaDate = simpleDateFormat.parse(fechaString);
	
		return fechaDate;
	}
	
	public static Date convertStringHourToDate(String fechaString) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMATO_FECHA_HORA);
		Date fechaDate = simpleDateFormat.parse(fechaString);
	
		return fechaDate;
	}
	
}
