public class Vivienda{
    //Atributos
    private int numHabitaciones;
    private int mCuadrados;
    private String tipo;
    private boolean tieneGaraje;

    //Constructor
    public Vivienda(int numHabitaciones, int mCuadrados, String tipo, boolean tieneGaraje){
        this.numHabitaciones = numHabitaciones;
        this.mCuadrados = mCuadrados;
        this.tipo = tipo;
        this.tieneGaraje = tieneGaraje;
    }

    // Getters
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public int getMCuadrados() {
        return mCuadrados;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isTieneGaraje() {
        return tieneGaraje;
    }

    //Setters
    public void setNumHabitaciones(int numHabitaciones){
        this.numHabitaciones=numHabitaciones;
    }

    public void setMCuadrados(int mCuadrados){
        this.mCuadrados=mCuadrados;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public void setTieneGaraje(boolean tieneGaraje){
        this.tieneGaraje=tieneGaraje;
    }
}
