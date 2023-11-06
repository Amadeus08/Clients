
package rc.jdbc.registrojdbc.logic;

import java.util.List;
import rc.jdbc.registrojdbc.persistencia.PersistenceController;


public class Controller {

     PersistenceController controlPer = new PersistenceController();
     
    public void AgregarCliente(String nombre, String apellido, String rfc) {
      
        Client cliente = new Client();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setRfc(rfc);
        
        controlPer.agregarCliente(cliente);
    }

    public List<Client> traerClientes() {
        
       return controlPer.TraerCliente();
        
        
    }

    public void borrarcliente(int idCliente) {
        controlPer.BorrarCliente(idCliente);
    }

    public Client traerClientesInt(int idCliente) {
    return controlPer.TraerClienteInt(idCliente);
    }

    public void modificarCliente(Client client, String nombre, String apellido, String rfc) {
        
        client.setNombre(nombre);
        client.setApellido(apellido);
        client.setRfc(rfc);
        
      controlPer.ModificarClienteLOG(client);
    }

   
    }
    

