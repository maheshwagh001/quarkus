//TicketResourceTest.java
package org.cencora;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.common.mapper.TypeRef;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@QuarkusTest
class TicketResourceTest {

//    @Inject
//    private TicketService ticketService;
//
//    @Test
//    void testGetAllTicketsEndPoint() {
//        List<Ticket> expected = ticketService.getAllTickets();
//        List<Ticket> actual =
//                given()
//                        .when().get("/tickets/get")
//                        .then()
//                        .statusCode(200)
//                        .extract()		//Extracts the response content
//                        .as(new TypeRef<List<Ticket>>() {});	//Converts the response body into a Java object, Provides the actual type so REST Assured knows how to map JSON to Ticket
//        assertEquals(expected.size(), actual.size());
//        assertEquals(expected.get(0).getId(), actual.get(0).getId());
//    }
//
//    @Test
//    void testGetTicketByIdEndPoint() {
//        Ticket expected = ticketService.getTicketById(1).orElseThrow();
//
//        Ticket actual =
//                given()
//                        .when().get("/tickets/get/1")
//                        .then()
//                        .statusCode(200)
//                        .extract()
//                        .as(Ticket.class);
//        assertEquals(expected.getId(), actual.getId());
//    }
//
//    @Test
//    void saveTicket() {
//        Ticket testTicket=new Ticket(101,"Sample ticket",LocalDate.now().toString());
//        Ticket actual =
//                given()
//                        .contentType("application/json")
//                        .body(testTicket)
//                        .when()
//                        .post("/tickets/post")
//                        .then()
//                        .statusCode(200)
//                        .extract()
//                        .as(Ticket.class);
//        assertEquals(testTicket.getId(), actual.getId());
//    }

}