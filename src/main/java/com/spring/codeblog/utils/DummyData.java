package com.spring.codeblog.utils;

import com.spring.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    @PostConstruct
    public void savePosts(){

    	/*
        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAuthor("Rafael Vilaruel");
        post1.setData(LocalDate.now());
        post1.setTitle("O que é Spring Boot?");
        post1.setText("O Spring Boot é uma ferramenta que visa facilitar o processo de configuração e publicação de aplicações que utilizem o ecossistema Spring.\r\n" + 
        		"\r\n" + 
        		"O Spring Boot fornece a maioria dos componentes baseados no Spring necessários em aplicações em geral de maneira pré-configurada, tornando possível termos uma aplicação rodando em produção rapidamente com o esforço mínimo de configuração e implantação.\r\n" + 
        		"\r\n" + 
        		"O Spring Boot permite ainda selecionarmos os módulos que desejamos utilizar.\r\n" + 
        		"\r\n" + 
        		"Com configurações rápidas, você consegue, por exemplo, disponibilizar uma aplicação baseada no Spring MVC, utilizando o Hibernate + JPA e o Thymeleaf como template engine.\r\n" + 
        		"\r\n" + 
        		"Se você não quer utilizar o Thymeleaf, é simples: basta habilitar outro módulo de view engine, como o Mustache.\r\n" + 
        		"\r\n" + 
        		"Para facilitar mais ainda, o Spring disponibiliza a página Spring Initializr. Nesta página, com alguns cliques, você pode habilitar os módulos desejados em seu projeto.\r\n" + 
        		"\r\n" + 
        		"No final, a página irá gerar um projeto Maven ou Gradle pré-configurado e com todos os componentes solicitados especificados, bastando ao desenvolvedor começar a trabalhar com a codificação.");

        Post post2 = new Post();
        post2.setAuthor("Rafael Vilaruel");
        post2.setData(LocalDate.now());
        post2.setTitle("Quem é Rafael Vilaruel?");
        post2.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }*/
    }
}
