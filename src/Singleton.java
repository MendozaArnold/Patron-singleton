public class Singleton {

    // Clase Singleton para gestionar la conexión
    private static class Conexion {

        // Instancia única de la clase
        private static Conexion instance;

        // Constructor privado para evitar la creación de instancias externas
        private Conexion() {
            // Inicialización de la conexión
        }

        // Método para obtener la instancia única de la clase
        public static Conexion getInstancia() {
            if (instance == null) {
                synchronized (Conexion.class) {
                    if (instance == null) {
                        instance = new Conexion();
                    }
                }
            }
            return instance;
        }

        // Método para abrir la conexión
        public void conexion() {
            System.out.println("La conexión está abierta.");
        }

        // Método para cerrar la conexión
        public void desconexion() {
            System.out.println("La conexión está cerrada.");
        }
    }

    public static void main(String[] args) {
        // Obtener la instancia única de la conexión
        Conexion conexion = Conexion.getInstancia();

        // Comprobar la conexión
        conexion.conexion();

        // Comprobar la desconexión
        conexion.desconexion();
    }
}
