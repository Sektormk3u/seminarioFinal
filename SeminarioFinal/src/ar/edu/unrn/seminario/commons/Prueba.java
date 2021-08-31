package ar.edu.unrn.seminario.commons;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Prueba {

	public static void main(String[] args) throws ParseException {

		/*Prueba de convertDateToString*/
		Calendar calendar1 = Calendar.getInstance();
		Date hoy1 = calendar1.getTime();
		System.out.println(Helper.convertDateToString(hoy1));
		
		
		/*Prueba de convertDateHourToString*/
		Calendar calendar2 = Calendar.getInstance();
		Date hoy2 = calendar2.getTime();
		System.out.println(Helper.convertDateHourToString(hoy2));
		
		
		/*Prueba de convertStringToDate*/
		String FORMATO_FECHA = "dd/M/yyyy";
		String prueba1 = new String("03/12/1982");
		System.out.println(Helper.convertStringToDate(prueba1));/*Imprime el tipo date, para imprimirlo bien pasarlo a String*/
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMATO_FECHA);
		String fechaString = simpleDateFormat.format(Helper.convertStringToDate(prueba1));
		System.out.println(fechaString);
		
		
		
		/*Prueba de convertStringHourToDate*/
		String prueba2= new String("05/11/1989 11:24:10");
		System.out.println(Helper.convertStringHourToDate(prueba2));
		String FORMATO_FECHA_HORA = "dd/M/yyyy hh:mm:ss";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(FORMATO_FECHA_HORA);
		String fechaString2 = simpleDateFormat2.format(Helper.convertStringHourToDate(prueba2));
		System.out.println(fechaString2);
		
		
	}

}
