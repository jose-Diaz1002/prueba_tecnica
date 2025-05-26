public abstract class Robot {
    private String nombre;
    private String fabricante;
    private int añoFabricacion;
    private int fechaRegistroCompeticion;

    public Robot(String nombre, String fabricante, int añoFabricacion, int fechaRegistroCompeticion) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.añoFabricacion = añoFabricacion;
        this.fechaRegistroCompeticion = fechaRegistroCompeticion;
    }

    public abstract String getDescripcionTecnica();

    public String getNombre() {
        return nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public int getFechaRegistroCompeticion() {
        return fechaRegistroCompeticion;
    }

    enum TipoTraccion { ORUGAS, RUEDAS }
    enum SistemaPropulsion { HELICE, CHORRO }
}
