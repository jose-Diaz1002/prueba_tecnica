public class Acuatico extends Robot{

    private String profundidadMaxima;
    private String sistemaPropulsion;

    public Acuatico(String nombre, String fabricante, int añoFabricacion, int fechaRegistroCompeticion, String profundidadMaxima, String sistemaPropulsion) {
        super(nombre, fabricante, añoFabricacion, fechaRegistroCompeticion);
        this.profundidadMaxima = profundidadMaxima;
        this.sistemaPropulsion = sistemaPropulsion;
    }

    @Override
    public String getDescripcionTecnica() {
        return getNombre() + " alcanza una profundidad de "+ profundidadMaxima + " metros con propulsion tipo " + sistemaPropulsion + " fabricado en " + getFabricante() + " en el año "+ getAñoFabricacion();
    }
}
