package reggie.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice(annotations ={Controller.class, RestController.class})
@ResponseBody//可以直接用@restcontroller就不用加responsebody注解
@Slf4j
//@RestControllerAdvice(annotations = {})

public class globalexceptionhandler {
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public R<String> globalexceptionhandler(SQLIntegrityConstraintViolationException ex){
        log.info(ex.getMessage());
        if (ex.getMessage().contains("Duplicate entry")){
        String[] split = ex.getMessage().split(" ");
        String s=split[2]+"已存在";
        return R.error(s);}

        return R.error("未知异常");
    }
    @ExceptionHandler(CustomException.class)
    public R<String> CustomException(CustomException ex){
        log.info(ex.getMessage());
        return R.error(ex.getMessage());
    }
}
