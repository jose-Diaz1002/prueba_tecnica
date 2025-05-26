public class Aereo extends Robot implements EvaluarResistencia{

   private String altitudMaxima;
   private String autonomiaVuelo;

   public Aereo(String nombre, String fabricante, int añoFabricacion, int fechaRegistroCompeticion, String altitudMaxima, String autonomiaVuelo) {
      super(nombre, fabricante, añoFabricacion, fechaRegistroCompeticion);
      this.altitudMaxima = altitudMaxima;
      this.autonomiaVuelo = autonomiaVuelo;
   }

   @Override
   public String getDescripcionTecnica() {
      return getNombre() + " vuela hasta " + altitudMaxima + " m durante "+ autonomiaVuelo + ". Fabricado en el año " + getAñoFabricacion() + " por " + getNombre();
   }


   @Override
   public Boolean puedeParticiparCompeticion() {
      return null;
   }
}
