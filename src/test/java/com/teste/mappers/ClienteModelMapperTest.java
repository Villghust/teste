package com.teste.mappers;

import com.teste.database.model.Cliente;
import com.teste.model.ClienteModel;
import com.teste.stub.ClienteModelStub;
import com.teste.stub.ClienteStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteModelMapperTest {

    @Test
    public void clienteModelToClienteTestingClienteStub() {
        Cliente response = ClienteModelMapper
                .clienteModelToCliente(ClienteModelStub.clienteModelStub());
        assertEquals(response, ClienteStub.clienteStub());
    }

    @Test
    public void clienteModelToClienteTestingClienteSemNome() {
        Cliente response = ClienteModelMapper
                .clienteModelToCliente(ClienteModelStub.clienteModelSemNome());
        assertEquals(response, ClienteStub.clienteSemNome());
    }

    @Test
    public void clienteModelToClienteTestingClienteSemLimite() {
        Cliente response = ClienteModelMapper
                .clienteModelToCliente(ClienteModelStub.clienteModelSemLimiteCredito());
        assertEquals(response, ClienteStub.clienteSemLimiteCredito());
    }

    @Test
    public void clienteToClienteModelClienteModelStub() {
        ClienteModel response = ClienteModelMapper
                .clienteToClienteModel(ClienteStub.clienteStub());
        assertEquals(response, ClienteModelStub.clienteModelStub());
    }

    @Test
    public void clienteToClienteModelClienteModelSemNome() {
        ClienteModel response = ClienteModelMapper
                .clienteToClienteModel(ClienteStub.clienteSemNome());
        assertEquals(response, ClienteModelStub.clienteModelSemNome());
    }

    @Test
    public void clienteToClienteModelClienteModelSemLimiteCredito() {
        ClienteModel response = ClienteModelMapper
                .clienteToClienteModel(ClienteStub.clienteSemLimiteCredito());
        assertEquals(response, ClienteModelStub.clienteModelSemLimiteCredito());
    }

    @Test
    public void clienteToClienteModelClienteModelSemRisco() {
        ClienteModel response = ClienteModelMapper
                .clienteToClienteModel(ClienteStub.clienteSemRisco());
        assertEquals(response, ClienteModelStub.clienteModelSemRisco());
    }

    @Test
    public void clienteToClienteModelClienteModelVazio() {
        ClienteModel response = ClienteModelMapper
                .clienteToClienteModel(ClienteStub.clienteVazio());
        assertEquals(response, ClienteModelStub.clienteModelVazio());
    }
}