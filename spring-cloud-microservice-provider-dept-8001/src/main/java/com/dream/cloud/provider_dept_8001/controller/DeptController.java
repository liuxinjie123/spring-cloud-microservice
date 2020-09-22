package com.dream.cloud.provider_dept_8001.controller;

import com.dream.cloud.api.entities.Dept;
import com.dream.cloud.provider_dept_8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService service;
    @Qualifier("discoveryClient")
    @Autowired
    private DiscoveryClient client;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        System.out.println("i am 8001 ");
        return service.get(id);
    }


    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return service.list();
    }


//	@Autowired
//	private DiscoveryClient client;

    /**
     * 服务发现：可以得到当前在eureka中已注册的服务
     */
    @GetMapping(value = "/dept/discovery")
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }

}
