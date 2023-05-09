
package tp6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directorio {
    private Map<String, Cliente> clientes;

    public Directorio() {
        clientes = new HashMap<>();
    }
    
    public void agregarCliente(String telefono, String dni, String nombre, String apellido, String ciudad, String direccion) {
        Cliente cliente = new Cliente(dni, nombre, apellido, ciudad, direccion);
        clientes.put(telefono, cliente);
    }
    
    public Cliente buscarCliente(String telefono) {
        return clientes.get(telefono);
    }

    public List<String> buscarTelefono(String apellido) {
        List<String> telefonos = new ArrayList<>();
        for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
            if (entry.getValue().getApellido().equals(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

    public List<Cliente> buscarClientes(String ciudad) {
        List<Cliente> clientesCiudad = new ArrayList<>();
        for (Cliente cliente : clientes.values()) {
            if (cliente.getCiudad().equals(ciudad)) {
                clientesCiudad.add(cliente);
            }
        }
        return clientesCiudad;
    }

    public void borrarCliente(String telefono) {
        clientes.remove(telefono);
    }
}