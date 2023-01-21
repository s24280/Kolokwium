package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class BankServiceMockTest {
    @ExtendWith(MockitoExtension.class)
    class ClientServiceMockTest {

        @Mock
        private ClientStorage clientStorage;
        @Mock
        ClientService clientService;
        @InjectMocks
        private BankService bankService;

        @Test
        void clientCantRegisterWithBlank() {
            //given
            Client client = new Client("", "", 0);
            when(ClientStorage.findClientById(any())).thenReturn(Optional.of(client));
            //when
            //clientService testRegister = bankService.registerCustomer("Tomson", "4321", 4000);
            // );
            //then
            // assertThat(testRegister.;
        }


        @Test
        void clientDosentExistinDataBase() {
            //given
            when(ClientStorage.findClientById(any())).thenReturn(Optional.empty());
            //when
            Optional<Client> testFind = ClientStorage.findClientById(String.valueOf(1000));
            //then
            assertThat(testFind).isNull();
        }
    }
}
