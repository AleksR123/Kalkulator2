import java.util.Scanner;

public class Kalkulator2 {

	public static void main(String[] args) {
			
			double a,b,c,h,plostina,perimetar,volumen,radius;
			double pi=3.14;
			
			 Scanner tastatura = new Scanner(System.in);

		        System.out.println("Odberi geometrisko telo za da presmetas plostina i perimetar/volumen:");
		        System.out.println("1. Kvadrat");
		        System.out.println("2. Krug");
		        System.out.println("3. Pravoagolnik");
		        System.out.println("4. Kocka");
		        System.out.println("5. Kvadar");
		        System.out.println("6. Topka");
		        System.out.println("7. Konus");

		        int odberi = tastatura.nextInt();

		        switch (odberi) {
		            case 1:
		                System.out.print("Vnesi ja stranata a na kvadratot: ");
		                 a = tastatura.nextDouble();
		                 perimetar = 4 * a;
		                 plostina = a * a;
		                System.out.println("Perimetarot na kvadratot e: " + perimetar);
		                System.out.println("Povrsinata na kvadratot e: " + plostina);
		                break;

		            case 2:
		                System.out.print("Vnesi go radiusot na krugot: ");
		                radius = tastatura.nextDouble();
		                 perimetar = 2 * pi * radius;
		                plostina = pi * radius * radius;
		                System.out.println("Perimetarot na krugot e: " + perimetar);
		                System.out.println("Plostinata na krugot e: " + plostina);
		                break;

		            case 3:
		                System.out.print("Vnesi ja stranata a na pravoagolnikot: ");
		                a = tastatura.nextDouble();
		                System.out.print("Vnesi ja stranata b na pravoagolnikot: ");
		                b = tastatura.nextDouble();
		                perimetar = 2 * a + 2 * b;
		                plostina = a * b;
		                System.out.println("Perimetarot na pravoagolnikot e: " + perimetar);
		                System.out.println("Plostinata na pravoagolnikot e: " + plostina);
		                break;

		            case 4:
		                System.out.print("Vnesi ja stranata a na kockata: ");
		                a = tastatura.nextDouble();
		                plostina = 6 * a * a;
		                volumen = a * a * a;
		                System.out.println("Plostinata na kockata e: " + plostina);
		                System.out.println("Volumenot na kockata e: " + volumen);
		                break;
		             
		            case 5:
		                System.out.print("Vnesi ja stranata a na kvadarot: ");
		                a = tastatura.nextDouble();
		                System.out.print("Vnesi ja stranata b na kvadarot: ");
		                b = tastatura.nextDouble();
		                System.out.print("Vnesi ja stranata c na kvadarot: ");
		                c = tastatura.nextDouble();
		                plostina = 2 * (a * b + a * c + b * c);
		                volumen = a * b * c;
		                System.out.println("Plostinata na kvadarot e: " + plostina);
		                System.out.println("Volumenot na kvadarot e: " + volumen);
		                break;
		                
		            case 6:
		                System.out.print("Vnesi go radiusot na topkata: ");
		                radius = tastatura.nextDouble();
		                plostina = 4 * pi * radius * radius;
		                volumen = 4 / 3 * (pi * radius * radius * radius);
		                System.out.println("Plostinata na topkata e: " + plostina);
		                System.out.println("Volumenot na topkata e: " + volumen);
		                break;
	    
		            case 7:
		                System.out.print("Vnesi ja visinata h na konusot: ");
		                h = tastatura.nextDouble();
		                System.out.print("Vnesi ja bazata a na konusot: ");
		                a = tastatura.nextDouble();
		                volumen = 1 / 3 * (pi * h * a);
		                System.out.println("Volumenot na konusot e: " + volumen);
		                break;
	    

		            default:
		                System.out.println("Greska broj odbravte");
		                break;
		        }

		        tastatura.close();
		    }
		
}
