
package rc.jdbc.registrojdbc.logic;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Client implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int idCliente;
    private String nombre;
    private String apellido;
    private String rfc;
       
    public Client(){
    
    }
    
    public Client(int idCliente){
     this.idCliente = idCliente;
    }
    
    public Client(int idCliente, String nombre, String apellido, String rfc){
    
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rfc = rfc;
    }
    
    public Client(String nombre, String apellido, String rfc){
    
        this.nombre = nombre;
        this.apellido = apellido;
        this.rfc = rfc;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente= ").append(idCliente);
        sb.append(", nombre= ").append(nombre);
        sb.append(", apellido= ").append(apellido);
        sb.append(", rfc= ").append(rfc);
        sb.append('}');
        return sb.toString();
    }
    
}
