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