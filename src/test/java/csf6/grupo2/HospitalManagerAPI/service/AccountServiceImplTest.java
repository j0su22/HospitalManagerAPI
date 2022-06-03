package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.Account;
import csf6.grupo2.HospitalManagerAPI.repository.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class AccountServiceImplTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountServiceImpl accountServiceImpl;

    private Account account, account_2, account_3;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        account = new Account(1, "merg8511", "1234", 1, 0);
        account_2 = new Account(2, "rodri", "5678", 0, 1);
        account_3 = new Account(3, "rrjr", "9101", 1, 0);
    }

    @Test
    void getAllAccounts() {
        when(accountRepository.findAll()).thenReturn(Arrays.asList(account, account_2, account_3));
        assertNotNull(accountServiceImpl.getAllAccounts());
    }
}