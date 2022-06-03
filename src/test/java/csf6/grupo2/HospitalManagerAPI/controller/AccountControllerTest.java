package csf6.grupo2.HospitalManagerAPI.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import csf6.grupo2.HospitalManagerAPI.model.Account;
import csf6.grupo2.HospitalManagerAPI.service.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AccountController.class)
class AccountControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private AccountService accountService;

    private Account ACCOUNT_1, ACCOUNT_2, ACCOUNT_3;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        ACCOUNT_1 = Account.builder().idAccount(1).username("merg8511").password("1234").isAdmin(1).state(0).build();
        ACCOUNT_2 = Account.builder().idAccount(2).username("abcds").password("1234").isAdmin(1).state(0).build();
        ACCOUNT_3 = Account.builder().idAccount(3).username("rodri").password("1234").isAdmin(1).state(0).build();
    }

    @Test
    void List() throws Exception {
        List<Account> response = new ArrayList<>(Arrays.asList(ACCOUNT_1, ACCOUNT_2, ACCOUNT_3));
        Mockito.when(accountService.getAllAccounts()).thenReturn(response);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(response);

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/account/getAll")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(json)
                        .accept("application/json"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[2].username", is("rodri")));
    }
/*
    @Test
    public void findAccount() throws Exception {
        Mockito.when(accountService.findAccount(ACCOUNT_1.getIdAccount())).thenReturn(Optional.of(ACCOUNT_1));
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(ACCOUNT_1);

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/account/find/1")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(json)
                        .accept("application/json"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(jsonPath("$.username", is("merg8511")));
    }
*/
}