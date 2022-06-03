package csf6.grupo2.HospitalManagerAPI.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import csf6.grupo2.HospitalManagerAPI.model.Account;
import csf6.grupo2.HospitalManagerAPI.model.City;
import csf6.grupo2.HospitalManagerAPI.model.Hospital;
import csf6.grupo2.HospitalManagerAPI.service.AccountService;
import csf6.grupo2.HospitalManagerAPI.service.HospitalService;
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

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HospitalController.class)
class HospitalControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private HospitalService hospitalService;

    private Hospital HOSPITAL_1, HOSPITAL_2, HOSPITAL_3;

    @BeforeEach
    void setUp() {
        City city = City.builder().idCity(1).name("Saint Jones").build();
        MockitoAnnotations.openMocks(this);
        HOSPITAL_1 = Hospital.builder().idHospital(1).name("San Jonh").street("NewStreet").idCity(city).build();
        HOSPITAL_2 = Hospital.builder().idHospital(2).name("Miss Apple").street("OldStreet").idCity(city).build();
        HOSPITAL_3 = Hospital.builder().idHospital(3).name("Mr Orange").street("Orange street").idCity(city).build();
    }

    @Test
    void listHospitals() throws Exception {
        List<Hospital> hospitals = new ArrayList<>(Arrays.asList(HOSPITAL_1, HOSPITAL_2, HOSPITAL_3));

        Mockito.when(hospitalService.getAllHospitals()).thenReturn(hospitals);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(hospitals);

        mockMvc.perform(MockMvcRequestBuilders
                .get("/hospital/getAll")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(json)
                .accept("application/json"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[2].name", is("Mr Orange")));
    }
}