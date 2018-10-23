package cl.clubhipico.clubhipico_francisco;

public class ClubHipicoThreadMain {

	public static void main(String[] args) {
		
		Thread ejemplo1Thread = new Thread(new ClubHipicoThread("Ejemplo1Thread","comer"));
		ejemplo1Thread.start(); //llama al run() de ClubHipicoThread
		ejemplo1Thread.setName("Ejemplo1Thread");
		
		Thread ejemplo2Thread = new Thread(new ClubHipicoThread("Ejemplo2Thread","dormir"));
		ejemplo2Thread.start(); //llama al run() de ClubHipicoThread
		ejemplo2Thread.setName("Ejemplo2Thread");

		Thread ejemplo3Thread = new Thread(new ClubHipicoThread("Ejemplo3Thread","caminar"));
		ejemplo3Thread.start(); //llama al run() de ClubHipicoThread
		ejemplo3Thread.setName("Ejemplo3Thread");

		Thread ejemplo4Thread = new Thread(new ClubHipicoThread("Ejemplo4Thread","saltar"));
		ejemplo4Thread.start(); //llama al run() de ClubHipicoThread
		ejemplo4Thread.setName("Ejemplo4Thread");

		Thread ejemplo5Thread = new Thread(new ClubHipicoThread("Ejemplo5Thread","beber"));
		ejemplo5Thread.start(); //llama al run() de ClubHipicoThread
		ejemplo5Thread.setName("Ejemplo5Thread");

		System.out.println("Thread 1:"+ejemplo1Thread.getName());
		System.out.println("Thread 2:"+ejemplo2Thread.getName());
		System.out.println("Thread 3:"+ejemplo3Thread.getName());
		System.out.println("Thread 4:"+ejemplo4Thread.getName());
		System.out.println("Thread 5:"+ejemplo5Thread.getName());
	}
}
