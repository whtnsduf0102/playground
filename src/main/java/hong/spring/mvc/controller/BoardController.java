package hong.spring.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class BoardController {
        @GetMapping("board/list")
        public String board(){
            return "board/list";
        }
}
