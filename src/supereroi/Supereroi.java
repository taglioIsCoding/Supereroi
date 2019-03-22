/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supereroi;
import java.util.Scanner;
/**
 *
 * @author 72873486
 */
public class Supereroi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Avengers IronMan = new Avengers(100,"Iron Man","Rosso",0,10);
        Avengers Thanos = new Avengers(1000000,"Thanos","Viola",10,10000000);
	Avengers DocStrange = new Avengers(5,"Doctor Strange","Sherlock",2,100);
	Avengers BruceBanner = new Avengers();
		
	Scanner input = new Scanner(System.in);
	System.out.println("Inserire parametri di HULK");
	BruceBanner.setPotere(input.nextInt());
	BruceBanner.setArma(input.nextInt());
	BruceBanner.setColore(input.next());
	BruceBanner.setNome(input.next());
	BruceBanner.setHP(input.nextInt());
        
        IronMan.attacco(DocStrange);
    }
    
}
