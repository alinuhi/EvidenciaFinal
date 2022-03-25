package codigofuente;

import java.util.Date;

public class Personas {
	public String Nombre;
	public String APaterno;
	public String AMaterno;
	public String sexo;
	public Date fecha_nacimiento;
	public float Altura;
	public String Tipo_Sangre;
	public String curp;
    public double Salario;
    public static int codigo_postal;
	
	
	
	//public static void main(String[] args) {
			// TODO Auto-generated method stub
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getAPaterno() {
		return APaterno;
	}
	public void setAPaterno(String aPaterno) {
		APaterno = aPaterno;
	}
	public String getAMaterno() {
		return AMaterno;
	}
	public void setAMaterno(String aMaterno) {
		AMaterno = aMaterno;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getAltura() {
		return Altura;
	}
	public void setAltura(float altura) {
		Altura = altura;
	}
	public String getTipo_Sangre() {
		return Tipo_Sangre;
	}
	public void setTipo_Sangre(String tipo_Sangre) {
		Tipo_Sangre = tipo_Sangre;
	}

	public static int getCodigo_postal() {
		return codigo_postal;
	}
	public static void setCodigo_postal(int codigo_postal) {
		Personas.codigo_postal = codigo_postal;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}

	}

