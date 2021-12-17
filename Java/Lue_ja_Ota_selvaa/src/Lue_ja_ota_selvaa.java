import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;

public class Lue_ja_ota_selvaa {
	public static void main(String[] args) {
		try {
			File tiedostoOlio1 = new File("pisteet.txt");
			Scanner lukijaOlio = new Scanner(tiedostoOlio1);
			while (lukijaOlio.hasNextLine()) {
				String data = lukijaOlio.nextLine();
				System.out.println(data);
			}
			lukijaOlio.close();
		}catch(FileNotFoundException e) {
			System.out.println("Tapahtui virhe.");
			e.printStackTrace();
		}
		System.out.println("");
		try {
			File tiedostoOlio2 = new File("polygoni.txt");
			Scanner lukijaOlio = new Scanner(tiedostoOlio2);
			while (lukijaOlio.hasNextLine()) {
				String data = lukijaOlio.nextLine();
				System.out.println(data);
			}
			lukijaOlio.close();
		}catch(FileNotFoundException e) {
			System.out.println("Tapahtui virhe.");
			e.printStackTrace();
		}

	}

}
