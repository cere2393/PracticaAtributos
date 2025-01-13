package practicacasa;

public class LigaPro {
	String clubes;
	int cantidadclubes;
	String aniofundacion;
	String apodos;
	int cantidadjugadores;
	private Float deudas;
	private Float valorAportacion;
	private Boolean aportaAliga;
	private String apodoDirectivos;
	private String menoresDeEdadIlegales;
	

	public LigaPro() {
		super();
		this.clubes ="";
		this.cantidadclubes =0;
		this.aniofundacion = "";
		this.apodos ="";
		this.cantidadjugadores =0;
		this.deudas =(float) 0;
		this.valorAportacion =(float) 0;
		this.aportaAliga =false;
		this.apodoDirectivos = "";
		this.menoresDeEdadIlegales ="";	
	}
	
	
	
	
	
	public LigaPro(String clubes, int cantidadclubes, String aniofundacion, String apodos, int cantidadjugadores) {
		super();
		this.clubes = clubes;
		this.cantidadclubes = cantidadclubes;
		this.aniofundacion = aniofundacion;
		this.apodos = apodos;
		this.cantidadjugadores = cantidadjugadores;
		this.deudas =(float) 0;
		this.valorAportacion =(float) 0;
		this.aportaAliga =false;
		this.apodoDirectivos = "";
		this.menoresDeEdadIlegales ="";	
	}
	
	
	public LigaPro(String clubes, int cantidadclubes, String aniofundacion, String apodos, int cantidadjugadores,
			Float deudas, Float valorAportacion, Boolean aportaAliga, String apodoDirectivos,
			String menoresDeEdadIlegales) {
		super();
		this.clubes = clubes;
		this.cantidadclubes = cantidadclubes;
		this.aniofundacion = aniofundacion;
		this.apodos = apodos;
		this.cantidadjugadores = cantidadjugadores;
		this.deudas = deudas;
		this.valorAportacion = valorAportacion;
		this.aportaAliga = aportaAliga;
		this.apodoDirectivos = apodoDirectivos;
		this.menoresDeEdadIlegales = menoresDeEdadIlegales;
	}









	public Float getDeudas() {
		return deudas;
	}
	public void setDeudas(Float deudas) {
		this.deudas = deudas;
	}
	public Float getValorAportacion() {
		return valorAportacion;
	}
	public void setValorAportacion(Float valorAportacion) {
		this.valorAportacion = valorAportacion;
	}
	public Boolean getAportaAliga() {
		return aportaAliga;
	}
	public void setAportaAliga(Boolean aportaAliga) {
		this.aportaAliga = aportaAliga;
	}
	public String getApodoDirectivos() {
		return apodoDirectivos;
	}
	public void setApodoDirectivos(String apodoDirectivos) {
		this.apodoDirectivos = apodoDirectivos;
	}
	public String getMenoresDeEdadIlegales() {
		return menoresDeEdadIlegales;
	}
	public void setMenoresDeEdadIlegales(String menoresDeEdadIlegales) {
		this.menoresDeEdadIlegales = menoresDeEdadIlegales;
	}
	
	public void mostrar()
	{
		System.out.println("****LigaPro datos publicos****");
		System.out.println("clubes:"+this.clubes);
		System.out.println("cantidadclubes:"+this.cantidadjugadores);
		System.out.println("aniofundacion:"+this.aniofundacion);
		System.out.println("apodos:"+this.apodos);
		
		
	}
	public void mostrar(String tipoimpresion)
	{
		if (tipoimpresion.equals("Confidencial"))
		{
		System.out.println("****LigaPro datos publicos y privados****");
		System.out.println("clubes:"+this.clubes);
		System.out.println("cantidadclubes:"+this.cantidadjugadores);
		System.out.println("aniofundacion:"+this.aniofundacion);
		System.out.println("apodos:"+this.apodos);
		System.out.println("valorAportacion:"+this.valorAportacion);
		System.out.println("aportaAliga:"+this.aportaAliga);
		System.out.println("apodoDirectivo:"+this.apodoDirectivos);
		System.out.println("menoresDeEdadIlegales:"+this.menoresDeEdadIlegales);
		
		}
		else 
		{
		System.out.println("****LigaPro datos publicos****");
		System.out.println("clubes:"+this.clubes);
		System.out.println("cantidadclubes:"+this.cantidadjugadores);
		System.out.println("aniofundacion:"+this.aniofundacion);
		System.out.println("apodos:"+this.apodos);
		}
	
	}
	
	

}
