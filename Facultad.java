public class Facultad extends Universidad{

private String carrera;

public Facultad(String ingeneria,String carrera){

super(ingeneria);
this.carrera=carrera;

}
public void tipo_programa(){
System.out.println("La carrera "+carrera+" pertenece a la facultad de ingeneria");
}

}