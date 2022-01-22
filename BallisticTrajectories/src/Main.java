import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bala> llistaBales = new ArrayList<Bala>();

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la velocidad inicial: ");
		double vO = teclado.nextDouble();

		System.out.println("Introduce el ángulo de lanzamiento: ");
		double alpha = teclado.nextDouble();

		ArrayList<Double> dades = new ArrayList<Double>();
		dades.add(vO);
		dades.add(alpha);

		Bala bala = new Bala(vO, alpha);
		bala.getAlpha();
		bala.getvO();
		System.out.println("La distància máxima de lanzamiento és: " + bala.calculaDistanciaMaxima(vO, alpha));
		System.out.println("La altura màxima de lanzamiento és: " + bala.calculAlçadaMaxima(vO));

		System.out.println("Quieres guardar los datos? True o False :");
		boolean guardaDades = teclado.nextBoolean();
		if (guardaDades == true) {
			guardaDadesArxiu(llistaBales, vO, alpha);
		} else {
			System.out.println("Tus datos no se han guardado");
		}
	}

	public static void guardaDadesArxiu(ArrayList<Bala> llistaBales, double vO, double alpha) {

		ArrayList<Bala> arrayList1 = new ArrayList<Bala>();

		System.out.println("Datos que escribiremos en el fichero:");
		for (int i = 0; i < 1; i++) {
			Bala bala1 = new Bala(vO, alpha);
			bala1.toString();
			arrayList1.add(bala1);
			System.out.println("arrayList1[" + i + "] = " + arrayList1.get(i));
			System.out.println(bala1.toString());
		}

		try {
			System.out.print("Guardando ArrayList en el fichero Fichero1.txt.. ");

			ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("D:\\fichero1.txt"));
			// escribiendoFichero.writeObject(arrayList1);
			Bala bala1 = new Bala(vO, alpha);
			escribiendoFichero.writeObject(bala1.toString());
			escribiendoFichero.close();

			System.out.println("ok!");
			System.out.print("Leyendo ArrayList del fichero Fichero1.txt.. ");

			ObjectInputStream leyendoFichero = new ObjectInputStream(new FileInputStream("D:\\Fichero1.txt"));

			// llistaBales = (ArrayList<Bala>) leyendoFichero.readObject();
			leyendoFichero.close();

			System.out.println("ok!");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
