package com.teste.mappers;

import com.teste.stub.ClienteModelStub;
import com.teste.stub.ClienteRequestStub;
import com.teste.stub.ClienteResponseStub;
import com.teste.contract.v1.mapper.ClienteMapper;
import com.teste.contract.v1.model.response.ClienteResponse;
import com.teste.model.ClienteModel;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteMapperTest {

    @Test
    public void mapperToContractClienteModelStub() {
        ClienteResponse response = ClienteMapper
                .mapperToContract(ClienteModelStub.clienteModelStub());
        Assert.assertEquals(response, ClienteResponseStub.clienteResponseStub());
    }

    @Test
    public void mapperToContractClienteModelSemNome() {
        ClienteResponse response = ClienteMapper
                .mapperToContract(ClienteModelStub.clienteModelSemNome());
        assertEquals(response, ClienteResponseStub.clienteResponseSemNome());
    }

    @Test
    public void mapperToContractClienteModelSemLimiteDeCredito() {
        ClienteResponse response = ClienteMapper
                .mapperToContract(ClienteModelStub.clienteModelSemLimiteCredito());
        assertEquals(response, ClienteResponseStub.clienteResponseSemLimiteCredito());
    }

    @Test
    public void mapperToModelClienteResponseStub() {
        ClienteModel response = ClienteMapper
                .mapperToModel(ClienteRequestStub.clienteRequestStub());
        assertEquals(response, ClienteModelStub.clienteModelStub());
    }

    @Test
    public void mapperToModelClienteResponseSemNome() {
        ClienteModel response = ClienteMapper
                .mapperToModel(ClienteRequestStub.clienteRequestSemNome());
        assertEquals(response, ClienteModelStub.clienteModelSemNome());
    }

    @Test
    public void mapperToModelClienteResponseSemLimiteDeCredito() {
        ClienteModel response = ClienteMapper
                .mapperToModel(ClienteRequestStub.clienteRequestSemLimiteCredito());
        assertEquals(response, ClienteModelStub.clienteModelSemLimiteCredito());
    }

    @Test
    public void mapperToModelClienteResponseSemRisco() {
        ClienteModel response = ClienteMapper
                .mapperToModel(ClienteRequestStub.clienteRequestSemRisco());
        assertEquals(response, ClienteModelStub.clienteModelSemRisco());
    }

    @Test
    public void mapperToModelClienteResponseVazio() {
        ClienteModel response = ClienteMapper
                .mapperToModel(ClienteRequestStub.clienteRequestVazio());
        assertEquals(response, ClienteModelStub.clienteModelVazio());
    }
}