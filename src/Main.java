public class Main {
    public static void main(String[] args) {

        //TODO: Crear los siguientes pasos para comprobar el funcionamiento del programa 
        // Crear una veterinaria
        Veterinaria veterinaria = new Veterinaria();
        // Crear dos clientes
        Cliente client1 = new Cliente("Manuel Gomez", "C/ Rosalía de Castro, 55, 1ºB", "981555555");
        Cliente client2 = new Cliente("Rosa Diaz", "C/ Venecia, 22, 7ºA", "611002233");
        // Agregar clientes a la veterinaria

        veterinaria.agregarCliente(client1);
        veterinaria.agregarCliente(client2);

        // Crear dos animales

        Animal animal1 = new Animal("Mr. Manchas", "Gato", "Común", client2);
        Animal animal2 = new Animal("Poncho", "Perro", "Border Collie", client1);

        // Agregar animales a la veterinaria

        veterinaria.agregarAnimal(animal1);
        veterinaria.agregarAnimal(animal2);

        //Crear un veterinario

        Veterinario veterinario = new Veterinario("Andrea Lopez", "Veterinaria jefe");

        // Crear una consulta

        Consulta consulta = new Consulta("02/03/24", "Revisión anual", "Renovación vacunas. Todo perfecto.", "No aplica", veterinario);

        // Asignar la consulta a un animal

        animal1.agregarConsulta(consulta);

        //Imprimir todas las consultas de los animales de la clínica

        veterinaria.imprimirConsultas();
    }

}