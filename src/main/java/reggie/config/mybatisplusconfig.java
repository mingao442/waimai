package reggie.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mybatisplusconfig {
    @Bean
    public MybatisPlusInterceptor interceptor(){
        MybatisPlusInterceptor my = new MybatisPlusInterceptor();
        my.addInnerInterceptor(new PaginationInnerInterceptor());
        return my;
    }
}
