package ejercicioAgroalimentario;

public abstract class P_Frios extends Productos {
private double temperaturaMantenimiento;

public double getTemperaturaMantenimiento() {
	return temperaturaMantenimiento;
}

public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
	this.temperaturaMantenimiento = temperaturaMantenimiento;
}

@Override
public String toString() {
	return "P_Frios [temperaturaMantenimiento=" + temperaturaMantenimiento + ", toString()=" + super.toString() + "]";
}


}
