package per.wsk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import per.wsk.service.BookService;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

}
