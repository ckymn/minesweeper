
/**
 *
 * @author cokya
 */
public class Main implements Runnable { //Çok akışlılığı sağlamaktadır. Runable arabirimini uygulayan sınıflar bu metodu override etmektedir.
     /*
       Thread yapisi bir baska form yada bir baska web sitesinden cevap vermyene kadar siteye giris yapamazsin ve o site hakkinda herhangi bir islem olmaz buda oyle
       Ya Thread extends  edilecek  Yada Runnable implements edilecek her ikisde ayni isi goruyor
    */
    
   GameClass game = new GameClass(); // Game Classa baglanmak icin bir Obje Olusturman gerekiyor 
	
	public static void main(String[] args) {
            
		(new Thread(new Main())).start(); // bir Main metodu da bir Thread olusturur.
                
	}

	@Override
	public void run() {
            
		while(true) {
			game.doIt();
			game.winCheck();
		}
	}
    
}
