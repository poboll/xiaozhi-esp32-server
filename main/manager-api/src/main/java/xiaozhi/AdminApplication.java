package xiaozhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"xiaozhi.modules.*.dao", "xiaozhi.*.dao"})  // 添加更多可能的路径模式
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
        System.out.println("http://localhost:8002/xiaozhi-esp32-api/api/v1/doc.html");
    }
}
