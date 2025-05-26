public class Terrestre extends Robot implements EvaluarResistencia {
   private int velocidadMaxima;
   private String tipoTraccion;

   public Terrestre(String nombre, String fabricante, int añoFabricacion, int fechaRegistroCompeticion, int velocidadMaxima, String tipoTraccion) {
      super(nombre, fabricante, añoFabricacion, fechaRegistroCompeticion);
      this.velocidadMaxima = velocidadMaxima;
      this.tipoTraccion = tipoTraccion;
   }

   public String getTipoTraccion() {
      return tipoTraccion;
   }

   @Override
   public String getDescripcionTecnica() {
      return getNombre() +" fabricado por "+ getFabricante() + " en el año " + getAñoFabricacion() + " usa traccion " + tipoTraccion + " alcaza hasta " + velocidadMaxima + " km/h.";
   }


   @Override
   public Boolean puedeParticiparCompeticion() {
      return null;
   }
}
