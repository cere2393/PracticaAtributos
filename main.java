package practicacasa;

public class main {

	public static void main(String[] args) {
		
		LigaPro objeto_LigaPro1 = new LigaPro("emelec barcelona liga",15,"dosmilcuatro", "bombillo torero", 300, (float)10000.23,(float)23456.23, true, "mostaza", "Juan alberto");
		
		objeto_LigaPro1.mostrar();
		objeto_LigaPro1.mostrar("Confidencial");
		
	}

}
