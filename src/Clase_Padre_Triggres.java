package Dispositivos;

public class Clase_Padre_Triggres extends Clase_Padre{
	
	boolean LuzEncendida = true;
	boolean VentanaAbierta = true;
	
	public boolean isLuzEncendida() {
		return LuzEncendida;
	}

	public void setLuzEncendida(boolean luzEncendida) {
		LuzEncendida = luzEncendida;
	}

	public boolean isVentanaAbierta() {
		return VentanaAbierta;
	}

	public void setVentanaAbierta(boolean ventanaAbierta) {
		VentanaAbierta = ventanaAbierta;
	}


	public boolean Encender_Apagar_Luz(boolean estado) {
		//True=Luz encendida;
		//False=Luz Apagada
		if(estado && isElectricidad()) {
			setLuzEncendida(estado);
			System.out.println("Las luces estan encendidad");
		}else if(!estado && isElectricidad()) {
			setLuzEncendida(estado);
			System.out.println("Las luces se han apagado");
		}else if(!isElectricidad()) {
			System.out.println("No hay electricidad para encender las luces");
		}
		
		return estado;
	}
}
