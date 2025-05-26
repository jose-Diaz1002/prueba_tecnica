public class Aereo extends Robot implements EvaluarResistencia{

   private String altitudMaxima;
   private int autonomiaVuelo;

   public Aereo(String nombre, String fabricante, int añoFabricacion, int fechaRegistroCompeticion, String altitudMaxima, int autonomiaVuelo) {
      super(nombre, fabricante, añoFabricacion, fechaRegistroCompeticion);
      this.altitudMaxima = altitudMaxima;
      this.autonomiaVuelo = autonomiaVuelo;
   }

   public String getAltitudMaxima() {
      return altitudMaxima;
   }

   public int getAutonomiaVuelo() {
      return autonomiaVuelo;
   }

   @Override
   public String getDescripcionTecnica() {
      return getNombre() + " vuela hasta " + altitudMaxima + " m durante "+ autonomiaVuelo + ". Fabricado en el año " + getAñoFabricacion() + " por " + getNombre();
   }


   @Override
   public String getResistencia() {
      if (autonomiaVuelo >= 60){
         return "Apto";
      }else{
         return "No apto";
      }

   }
}
