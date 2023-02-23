import java.util.Random;
import java.text.DecimalFormat;

public class pregunta1_1 {
	public static void main(String[] args) {
		double dist_marco, dist_mama = 0,dist_inicial_mama = 350,dist_total_mama = 0, dist_entre_ellos = 1; //todas las distancias
		double v_marco, v_mama = 100,t_marco,t_mama,probabilidad;
		int dia=1,lluvia, lluvia2,amedio_cansado = 0,amedio_escapado;

		System.out.println("DIARIO DEL VIAJE DE MARCO");
		System.out.println("==========================");

		
		for(int i = 1;i<=5;i++) {
			Random random = new Random();
			DecimalFormat df = new DecimalFormat("#.00");
			
			System.out.println("DIA "+dia);


			//velocidad de marco, normal y afectada por amedio y demas 
			double min_velocidad = 10.0;
			double max_velocidad = 15.0;
			v_marco = random.nextDouble(max_velocidad-min_velocidad) + min_velocidad;

			lluvia = random.nextInt(10)+1;

			if (lluvia == 1|| lluvia == 2||lluvia == 3||lluvia == 4|| lluvia == 5||lluvia == 6){
				System.out.println("Ha hecho un buen dia");

			}
			else if (lluvia == 7|| lluvia == 8||lluvia == 9){
				System.out.println("Ha llovido un poco");
				v_marco = v_marco*0.25;

			}
			else{
				System.out.println("Ha llovido muchisimo!");
				v_marco = v_marco*0.75;
			}
			//---------------------------------------

			amedio_cansado = random.nextInt(5)+1;
			if (amedio_cansado==1) {
				v_marco = v_marco*0.10;
				System.out.println("Amedio esta cansado.  ");
			}

			//tiempo de marco
			double max_tiempo = 10.0;
			double min_tiempo = 8.0;
			t_marco = random.nextDouble(max_tiempo-min_tiempo) + min_tiempo;	 

			amedio_escapado = random.nextInt(5)+1;
			if (amedio_escapado==1) {
				System.out.println("He perdido tiempo buscanso a Amedio! ");
				t_marco = t_marco-2;
			}

			//distancia marco 
			dist_marco = t_marco * v_marco;

			System.out.print("Avance: ");;System.out.print(df.format(t_marco)); System.out.print(" horas, a ");System.out.print(df.format(v_marco));System.out.print(" km/h, recorriendo ");System.out.print(df.format(dist_marco));System.out.print(" km. \n");

			dia+=1;
			
			 System.out.println(" ");
			//velocidad de marco, normal y afectada por amedio y demas 
			double min_velocidad_2 = 10.0;
			double max_velocidad_2 = 15.0;
			v_mama = random.nextDouble(max_velocidad_2-min_velocidad_2) + min_velocidad_2;
			 
		      lluvia2 = random.nextInt(10)+1; //tomo en cuenta que la lluvia tambien afecta a la velocidad de la mama

		      if (lluvia2 == 1|| lluvia2 == 2||lluvia2 == 3||lluvia2 == 4|| lluvia2 == 5||lluvia2 == 6){
		    	  System.out.println("A mama le ha hecho un buen dia");

		      }
		      else if (lluvia2 == 7|| lluvia2 == 8||lluvia2 == 9){
		    	  System.out.println("A mama le ha llovido un poco");
		    	  v_mama = v_mama*0.25;
		      }
		      else{
		    	  System.out.println("A mama le ha llovido muchisimo!");
		    	  v_mama = v_mama*0.75;
		      }
		      
		    //tiempo mama (este es un promedio que determine debido a los resultados de la bitacpra de ejemplo)
		      double max_tiempo_2 = 8.0;
		      double min_tiempo_2 = 5.0;
		      t_mama = random.nextDouble(max_tiempo_2-min_tiempo_2) + min_tiempo_2;	 
		      dist_mama = v_mama*t_mama;
		     
		    //distancia mama 
		      dist_total_mama = dist_inicial_mama+dist_mama;
		      dist_inicial_mama = 0;

		      System.out.print("El avance de mama fue de: ");System.out.print(df.format(t_mama)); System.out.print(" horas, a ");System.out.print(df.format(v_mama));System.out.print(" km/h, recorriendo ");System.out.print(df.format(dist_mama));System.out.print(" km. \n");

		      dist_entre_ellos=  dist_total_mama -dist_marco;
		      if (dist_entre_ellos <= 50){
		    	  double menor = 0.0;
		    	  double mayor = 100.0;
		    	  probabilidad = random.nextDouble(mayor-menor) + menor;
		    	  if (probabilidad>=50) {
		    		  dist_marco+=25;
		    		  System.out.println("A marco le dicen que han visto a su mama, y rompe a correr!!");
		              System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		              break;  
		    	  }
	                
	            } 
		      if (dist_entre_ellos <= 0){
	                System.out.println("A marco le dicen que han visto a su mama, y rompe a correr!!");
	                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
	                break;
	            } 
		      System.out.print("La distancia entre Marco y su mama es de: " );System.out.print(df.format(dist_entre_ellos));System.out.print(" km.\n" );
		      System.out.println(" ");
		}
		System.out.println("Al final del dia "+dia+" Marco encuentra a su madre");
        System.out.println("====================================================");

	}
}
