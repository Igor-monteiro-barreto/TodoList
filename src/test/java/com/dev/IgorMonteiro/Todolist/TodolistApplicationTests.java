package com.dev.IgorMonteiro.Todolist;

import com.dev.IgorMonteiro.Todolist.Model.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TodolistApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	//Teste triplo A, Assert Act e A
	@Test
	void TesteTodoCreateSucess () {
	var todo = new Todo("Todo teste","Todo descrição",true,1);
		WebTestClient.BodyContentSpec $ = webTestClient
				.post()
				.uri("/todos/create")
				.bodyValue(todo)
				.exchange()
				.expectStatus().isOk()
				.expectBody()
				.jsonPath("$").isArray()
				.jsonPath("$.length()").isEqualTo(1)
				.jsonPath("$[0].name").isEqualTo(todo.getName())
				.jsonPath("$[0].descricao").isEqualTo(todo.getDescricao())
				.jsonPath("$[0].realizado").isEqualTo(todo.isRealizado())
				.jsonPath("$[0].prioridade").isEqualTo(todo.getPrioridade());
	}
	@Test
	void TesteTodoCreateFalure () {
		webTestClient
				.post()
				.uri("/todos/create")
				.bodyValue(
				new Todo("","",false,0))
				.exchange()
				.expectStatus().isBadRequest();
	}

}
