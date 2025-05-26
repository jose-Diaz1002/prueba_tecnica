public class Terrestre extends Robot implements EvaluarResistencia {
   private double velocidadMaxima;
   private TipoTraccion tipoTraccion;

   public Terrestre(String nombre, String fabricante, int añoFabricacion, int fechaRegistroCompeticion, int velocidadMaxima, TipoTraccion tipoTraccion) {
      super(nombre, fabricante, añoFabricacion, fechaRegistroCompeticion);
      this.velocidadMaxima = velocidadMaxima;
      this.tipoTraccion = tipoTraccion;
   }

   public double getVelocidadMaxima() {
      return velocidadMaxima;
   }

   public TipoTraccion getTipoTraccion() {
      return tipoTraccion;
   }

   @Override
   public String getDescripcionTecnica() {
      return getNombre() +" fabricado por "+ getFabricante() + " en el año " + getAñoFabricacion() + " usa traccion " + tipoTraccion + " alcaza hasta " + velocidadMaxima + " km/h.";
   }


   @Override
   public String getResistencia() {
      boolean apto = tipoTraccion == TipoTraccion.ORUGAS;
      if(tipoTraccion.equals(tipoTraccion.ORUGAS)){
         return "Apto";

      }else {
         return "No apto";
      }

   }
}
