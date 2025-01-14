package lh.h.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // /files/** URL을 /home/ubuntu/test/h/files 디렉토리로 매핑
        registry.addResourceHandler("/files/**")
                .addResourceLocations("file:/home/ubuntu/test/h/files/");
    }
}
