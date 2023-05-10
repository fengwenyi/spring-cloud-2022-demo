## Spring Cloud OpenFeign

implementation 'org.springframework.cloud:spring-cloud-starter-openfeign'

spring-cloud-starter-openfeign -> openfeign-core -> feign


## HttpClient 5

implementation 'io.github.openfeign:feign-hc5:12.3'

org.springframework.cloud.openfeign.FeignAutoConfiguration.HttpClient5FeignConfiguration

org.springframework.cloud.openfeign.clientconfig.HttpClient5FeignConfiguration

feign.hc5.ApacheHttp5Client.ApacheHttp5Client(org.apache.hc.client5.http.classic.HttpClient)

org.apache.hc.core5.http.ClassicHttpRequest

org.apache.hc.client5.http.impl.classic.CloseableHttpClient.execute(org.apache.hc.core5.http.HttpHost, org.apache.hc.core5.http.ClassicHttpRequest, org.apache.hc.core5.http.protocol.HttpContext)

*** org.apache.hc.client5.http.impl.classic.CloseableHttpClient.doExecute


## 记录

Spring Cloud 新版移除了 Ribbon，使用了自己的 loadbalancer

所以，添加依赖：

```groovy
implementation 'org.springframework.cloud:spring-cloud-loadbalancer'
```


## 官方文档



