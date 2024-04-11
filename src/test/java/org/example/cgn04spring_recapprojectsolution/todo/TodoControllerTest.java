package org.example.cgn04spring_recapprojectsolution.todo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.http.server.reactive.MockServerHttpRequest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class TodoControllerTest {


    @Autowired
    MockMvc mockMvc;

    @Autowired
    TodoRepository todoRepository;

    @Test
    void getAllTodos() throws Exception {
        //GIVEN

        //WHEN
        mockMvc.perform(MockMvcRequestBuilders.get("/api/todo"))

        //THEN
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        []
                        """));
    }
//  DIESER INTEGRATIONSTEST KLAPPT NICHT

//    @Test
//    void postTodo() {
//        //GIVEN
//
//        //WHEN
//        mockMvc.perform(MockServerHttpRequest.post("/api/todo")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("""
//                           {
//                             "description": "test-description",
//                             "satus": "OPEN"
//                           }
//                        """)
//                )
//
//                //THEN
//                .andExpect(status().isOk())
//                .andExpect(content().json("""
//                           {
//                           "description": "test-description",
//                           "satus": "OPEN"
//                           }
//                        """))
//                .andExpect(jsonPath("$.id")).isNotEmpty());
//             }

//AUCH HIER LÄUFT WAS SCHIEF

//    @Test
//    @DirtiesContext
//    void putTodo() throws Exception{
//        //GIVEN
//        Todo existingTodo = new Todo("1", "test-description", "OPEN");
//
//        todoRepository.save(existingTodo);
//
//        //WHEN
//        mockMvc.perform(put("/api/todo/1")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("""
//                           {
//                                "description": "test-description-2",
//                                "satus": "IN_PROGRESS"
//                           }
//                        """))
//        //THEN
//                .andExpect(status().isOk())
//                .andExpect(content().json("""
//                        {
//                                "id": "1",
//                                "description": "test-description-2",
//                                "satus": "IN_PROGRESS"
//                        }
//                        """));
//
//}
}