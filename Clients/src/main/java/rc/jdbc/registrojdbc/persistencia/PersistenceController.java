
package rc.jdbc.registrojdbc.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import rc.jdbc.registrojdbc.logic.Client;
import rc.jdbc.registrojdbc.persistencia.exceptions.NonexistentEntityException;


public class PersistenceController {

    ClienteJpaController clienteJpa = new ClienteJpaController();
    
    
    public void agregarCliente(Client cliente) {
        
        clienteJpa.create(cliente);
    }

    public List<Client> TraerCliente() {
        
        return clienteJpa.findClienteEntities();
                
    }

    public void BorrarCliente(int idCliente) {
        try {
            clienteJpa.destroy(idCliente);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public Client TraerClienteInt(int idCliente) {
       return clienteJpa.findCliente(idCliente);
    }

    public void ModificarClienteLOG(Client client) {
        try {
            clienteJpa.edit(client);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

   



   
    
    
}
