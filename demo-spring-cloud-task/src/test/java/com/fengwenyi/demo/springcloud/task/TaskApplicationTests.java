package com.fengwenyi.demo.springcloud.task;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 测试未通过
 * @author <a href="https://fengwenyi.com">Erwin Feng</a>
 * @since 2023-05-10
 */
@SpringBootTest
@ExtendWith(OutputCaptureExtension.class)
public class TaskApplicationTests {

    @Test
    public void contextLoads(CapturedOutput capturedOutput){
        assertTrue(capturedOutput.toString().contains("Hello, World!"));
        assertTrue(capturedOutput.toString().contains("Hello World! from ApplicationRunner"));
    }

}
