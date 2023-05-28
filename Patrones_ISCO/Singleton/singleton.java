package Patrones_ISCO.Singleton;

class impresora {
	private static impresora impresora;
	private int NumeroPaginas;
	private impresora() {
	}
	public static impresora getInstance() {
		return impresora == null ? impresora = new impresora() : impresora;
	}
	public void print(String text){
		System.out.println(text +
				"\n" + "número de páginas impresas hoy: " + ++NumeroPaginas +
				"\n" + "---------");
	}
}
//--------------------------------------------------------------------------------------------------
class empleado {
	private final String nombre;
	private final String posicion;
	private final String rol;
	public empleado(String nombre, String posicion, String rol) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.rol = rol;
	}
	public void printCurrentfuncion(){
		impresora impresora = Patrones_ISCO.Singleton.impresora.getInstance();
		impresora.print("empleado: " + nombre + "\n" +
			"Posición: " + posicion + "\n" +
			" Función: " + rol + "\n");
	}
}
//--------------------------------------------------------------------------------------------------
public class singleton {
	public static void main(String[] args) {
		empleado andreas = new empleado ("Andreas",
				"Jefe",
				"Gestiona la sucursal");
		empleado julia = new empleado ("Julia",
				"Consultor",
				"Asesora a los clientes sobre las quejas");
		empleado tom = new empleado ("Tom",
				"Venta",
				"Vende los productos");
		empleado stefanie = new empleado ("Stefanie",
				"Desarrollador",
				" Mantenimiento informático en la sucursal.");
		empleado matthias = new empleado ("Matthias",
				"Contable",
				"contabilidad financiera de la sucursal.");
		andreas.printCurrentfuncion();
		julia.printCurrentfuncion();
		tom.printCurrentfuncion();
		stefanie.printCurrentfuncion();
		matthias.printCurrentfuncion();
	}
}