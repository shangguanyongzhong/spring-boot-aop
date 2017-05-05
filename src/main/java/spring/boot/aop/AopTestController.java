package spring.boot.aop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *          * @RestController==============@ResponseBody ＋ @Controller
 * Created by P0093203 on 2017/3/22.
 */
@RestController
@RequestMapping("/aop")
public class AopTestController {

   @RequestMapping("/testBeforeService.do")
    public String testBeforeService(String key,String value){

        return "key="+key+"  value="+value;
    }
    @RequestMapping("/testAfterReturning.do")
    public String testAfterReturning(String key){

        return "key=: "+key;
    }
    @RequestMapping("/testAfterReturning01.do")
    public Integer testAfterReturning01(Integer key){

        return key;
    }

    @RequestMapping("/testAfterThrowing.do")
    public String testAfterThrowing(String key){

        throw new NullPointerException();
    }

    @RequestMapping("/testAfter.do")
    public String testAfter(String key){

        throw new NullPointerException();
    }
    @RequestMapping("/testAfter02.do")
    public String testAfter02(String key){

        return key;
    }

    @RequestMapping("/around.do")
    public String testAroundService(String key){

        return "环绕通知："+key;
    }




}