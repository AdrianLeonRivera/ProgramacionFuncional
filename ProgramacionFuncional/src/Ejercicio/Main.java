package Ejercicio;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		int contador=0;
		List<Integer>listaNumeros=new ArrayList<>();
		
		for(int i=0; i<20;i++)
		{
			if(i>10)
			{
				listaNumeros.add(i+1);
			}
		}
		
		List<Integer>numeros=List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
		
		List<Integer>respuesta=numeros.stream().filter(x -> x > 10).collect(Collectors.toList());
		
		System.out.println("Programacion Funcional");
		System.out.println(respuesta);
		System.out.println("Programacion Imperativa");
		System.out.println(contador);
		
		
	}

}
