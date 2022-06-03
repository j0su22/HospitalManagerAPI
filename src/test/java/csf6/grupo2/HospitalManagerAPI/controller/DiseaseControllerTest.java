package csf6.grupo2.HospitalManagerAPI.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import csf6.grupo2.HospitalManagerAPI.model.Disease;
import csf6.grupo2.HospitalManagerAPI.service.DiseaseService;
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

@WebMvcTest(DiseaseController.class)
class DiseaseControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private DiseaseService diseaseService;

    private Disease DISEASE_1, DISEASE_2, DISEASE_3;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        DISEASE_1 = Disease.builder().idDisease(1).name("Leprosy").inheritance(0).state(1).build();
        DISEASE_2 = Disease.builder().idDisease(2).name("Migraine").inheritance(1).state(1).build();
        DISEASE_3 = Disease.builder().idDisease(3).name("Diabetes").inheritance(1).state(1).build();
    }

    @Test
    void listDisease() throws Exception {
        List<Disease> diseases = new ArrayList<>(Arrays.asList(DISEASE_1,DISEASE_2,DISEASE_3));
        Mockito.when(diseaseService.getAllDiseases()).thenReturn(diseases);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(diseases);

        mockMvc.perform(MockMvcRequestBuilders
                .get("/disease/getAll")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(json)
                .accept("application/json"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[2].name", is("Diabetes")));
    }
}