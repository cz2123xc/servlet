package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // Component Scan 대상 + 리퀘스트 핸들러 맵핑으로 인식
//@Component // bin 등록 (@Controller 안쓰고 사용할 경우)
//@RequestMapping // 리퀘스트 핸들러 맵핑이 인식 (@Controller 안쓰고 사용할 경우)
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form"); // view name
    }

}
