package com.spring.springblog.utils;

import com.spring.springblog.Model.Post;
import com.spring.springblog.repository.SpringblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

  @Autowired
  SpringblogRepository springblogRepository;

  // Método executado ao subir a aplicação
  @PostConstruct
  public void savePosts() {

    List<Post> postList = new ArrayList<>();

    Post post1 = new Post();
    post1.setAutor("Marcio Lisboa");
    post1.setData(LocalDate.now());
    post1.setTitulo("Spring");
    post1.setTexto("<p>Olá, para inserir um novo post:</p><p>Username: admin</p><p>Password: 123</p><p><br></p>");

    Post post2 = new Post();
    post2.setAutor("Dexter Morgan");
    post2.setData(LocalDate.now());
    post2.setTitulo("Docker");
    post2.setTexto("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?");

    Post post3 = new Post();
    post3.setAutor("John Locke");
    post3.setData(LocalDate.now());
    post3.setTitulo("Java");
    post3.setTexto("At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.");

    postList.add(post1);
    postList.add(post2);
    postList.add(post3);

    for (Post post: postList) {
      Post postSaved = springblogRepository.save(post);
      System.out.println("Post saved: " + postSaved.getId());
    }
  }
}
