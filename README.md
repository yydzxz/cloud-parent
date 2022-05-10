### TODO list
- [ ] JWT
- [ ] https

- 先启动eureka-server
- 再启动config-server,因为配置中心也需要向eureka中注册


### 启动其他项目
#### zipkin
##### 1.默认保存到内存
```bash
docker run -d -p 9411:9411 openzipkin/zipkin
```

##### 2.使用elasticisearch保存
- 这个镜像的zipkin已经包含了elasticsearch
```bash
cd docker/zipkin
docker-compose -f docker-compose-elasticsearch.yml up
```