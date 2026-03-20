package com.food;



import com.food.controller.TaxController;
import com.food.service.TaxService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(TaxController.class)
public class TaxControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TaxService taxService;

    @Test
    public void testCalculateTax() throws Exception {

        // Mocking service response
        when(taxService.calculateTax(500000)).thenReturn(50000.0);

        // Perform GET request and validate response
        mockMvc.perform(get("/tax/calculate")
                        .param("salary", "500000"))
                .andExpect(status().isOk())
                .andExpect(content().string("Salary: 500000.0 | Tax: 50000.0"));
    }
}
//Test starts
//
//Spring loads only controller
//
//TaxService is mocked
//
//You define mock behavior
//
//MockMvc sends fake HTTP request
//
//Controller calls mocked service
//
//Mock returns value
//
//Response is verified
//
//2. JUnit runs the method marked with @Test.
//
//A mock version of TaxService is already created using @MockBean.
//
//        when(...).thenReturn(...) defines fake behavior for the service.
//
//So, calling calculateTax(500000) will return 50000.0.
//
//MockMvc simulates an HTTP GET request to /tax/calculate.
//
//The query parameter salary=500000 is passed in the request.
//
//Spring sends this request to the TaxController.
//
//Controller calls the mocked TaxService instead of real logic.
//
//Controller builds response: "Salary: 500000.0 | Tax: 50000.0".
//
//Test verifies response status is 200 and output matches expected string.