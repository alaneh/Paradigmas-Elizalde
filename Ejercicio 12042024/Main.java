public class Main {
    public static void main(String[] args) {
        // Crear una nueva instancia de Persona
        Persona persona = new Persona("Juan", "Pérez", 30, "Masculino", "123 Calle Principal", "123456789", "juan@example.com", "Mexicana", "Soltero", "Ingeniero");

        System.out.println("Nombre completo: " + persona.getNombre() + " " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Género: " + persona.getGenero());
        System.out.println("Dirección: " + persona.getDireccion());
        System.out.println("Teléfono: " + persona.getTelefono());
        System.out.println("Correo electrónico: " + persona.getEmail());
        System.out.println("Nacionalidad: " + persona.getNacionalidad());
        System.out.println("Estado civil: " + persona.getEstadoCivil());
        System.out.println("Profesión: " + persona.getProfesion());
    }
}
